package com.example.testuirenderxml;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.fdi._2010.client.ActionT;
import org.fdi._2010.client.ChartT;
import org.fdi._2010.client.DialogT;
import org.fdi._2010.client.EnumerationItemListT;
import org.fdi._2010.client.EnumerationItemT;
import org.fdi._2010.client.GraphT;
import org.fdi._2010.client.GridT;
import org.fdi._2010.client.GroupT;
import org.fdi._2010.client.HandlingT;
import org.fdi._2010.client.ImageT;
import org.fdi._2010.client.LayoutItemsT;
import org.fdi._2010.client.LayoutObjectT;
import org.fdi._2010.client.LayoutT;
import org.fdi._2010.client.PageT;
import org.fdi._2010.client.ParameterT;
import org.fdi._2010.client.PluginT;
import org.fdi._2010.client.TableT;
import org.fdi._2010.client.UiTemplateT;
import org.fdi._2010.client.UidLayoutInformation;
import org.fdi._2010.client.WindowT;
import org.xml.sax.InputSource;

import ae.com.sun.xml.bind.v2.model.annotation.RuntimeInlineAnnotationReader;
import ae.com.sun.xml.bind.v2.model.annotation.XmlSchemaMine;
import ae.javax.xml.bind.JAXBContext;
import ae.javax.xml.bind.JAXBElement;
import ae.javax.xml.bind.JAXBException;
import ae.javax.xml.bind.Unmarshaller;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BrowseMenuFragment extends Fragment {

	private static String choice;
	private  ArrayList<String> firstMenu=new ArrayList<String>();
	private  ArrayList<String> nextMenu=new ArrayList<String>();	
	private  List<Object> myList;
	private  ArrayAdapter<String> firstAdapter;
	private  ArrayAdapter<String> nextAdapter;
	private  ListView listView;
	private static boolean isfirstList=true;
	private LayoutT browseObject;
	private List<JAXBElement<?>> items;
	private JAXBContext jc;
	private Unmarshaller unmarshaller;
	private View v;
	private RenderedFragment renderedFrag=null;
	private RenderedFragment prevRenderedFrag=null;
	
	public void generateFirstMenu() throws JAXBException
	{
	   
		jc = JAXBContext.newInstance("org.fdi._2010.client");
		unmarshaller = jc.createUnmarshaller();
		
		InputSource xmlString = new InputSource(new StringReader(XmlString.xmlString));
		UidLayoutInformation myLayout=(UidLayoutInformation)unmarshaller.unmarshal(xmlString);
		RuntimeInlineAnnotationReader.cachePackageAnnotation(LayoutT.class.getPackage(), new XmlSchemaMine("http://fdi.org/2010/client"));
		
		myList=myLayout.getMenuOrPageOrGroup();
	
		if(!firstMenu.isEmpty())
			 firstMenu.clear();
		for(int i=0;i<myList.size();i++)
		{
			firstMenu.add(((LayoutObjectT)(myList.get(i))).getLabel());
						
		}
		
		// We need to use a different list item layout for devices older than Honeycomb
		
		int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB ?
                android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_list_item_1;
        firstAdapter = new ArrayAdapter<String>(getActivity(),layout, firstMenu);
        
		listView.setAdapter(firstAdapter);
	
		listView.setOnItemClickListener(myListener);
		
	
	}
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        RuntimeInlineAnnotationReader.cachePackageAnnotation(WindowT.class.getPackage(), new XmlSchemaMine("http://fdi.org/2010/client"));
              
	}

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {

        // If activity recreated (such as from screen rotate), restore
        // the previous article selection set by onSaveInstanceState().
        // This is primarily necessary when in the two-pane layout.
        if (savedInstanceState != null) {
            //mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
        }
    	v= inflater.inflate(R.layout.menu_fragment_layout, null);
        listView = (ListView)v.findViewById(R.id.mainListView);
        
        try {
			generateFirstMenu();
		}  
        catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return v;
    }
	
    @Override
    public void onStart() {
        super.onStart();

        // When in two-pane layout, set the listview to highlight the selected list item
        // (We do this during onStart because at the point the listview is available.)
        if (getActivity().findViewById(R.id.fragment_container)== null) {
            listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }
    }
    
    
    void browse(LayoutT browseObj)
   	{
       	browseObject=browseObj;
       	LayoutItemsT itemList;
   		itemList=browseObj.getItemList();
   		items=itemList.getWindowOrDialogOrPage();
   		System.out.println("Please select one of the following :-");
   		if(!nextMenu.isEmpty())
   			nextMenu.clear();
   		for(int i=0;i<items.size();i++)
   		{	
   			nextMenu.add(((LayoutT)(items.get(i).getValue())).getLabel());			
   		}
   	
   		if(nextAdapter==null)
   		{
   			// We need to use a different list item layout for devices older than Honeycomb
   			
   			int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB ?
   	                android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_list_item_1;
   			
   			nextAdapter = new ArrayAdapter<String>(getActivity(),layout, nextMenu);
   			listView.setAdapter(nextAdapter);
   		}
   		nextAdapter.notifyDataSetChanged();
   		
   	}
       
       
   	
   	
   	

   
    
    
    OnItemClickListener myListener= new OnItemClickListener() 
	{
	    @Override
	    public void onItemClick(AdapterView<?> adapterView, View arg1, int position, long arg3) 
	    {
	    	
	    	if(isfirstList)
	    	{
	    		LayoutT browseMe=(LayoutT)(myList.get(position));
	    		browseMe.parentNode=null;
				isfirstList=false;
				browse(browseMe);
	    	}
	    	else
	    	{	
	    		JAXBElement<?> clickedElement=items.get(position);
				String elementType= clickedElement.getDeclaredType().toString();
				if(elementType.contentEquals(Constants.MENU))
				{
					LayoutT browseChild=(LayoutT)(clickedElement.getValue());
					if(browseChild.parentNode==null)
					{
						browseChild.parentNode=browseObject;
					}
					browse(browseChild);
				}
				else 
				{
					prevRenderedFrag=renderedFrag;
					renderedFrag=new RenderedFragment();
					if (getActivity().findViewById(R.id.fragment_container) == null) {
						
						//For Dual Pane Layout when there is no previous fragment on the right pane
						if(prevRenderedFrag==null)
						{
							getActivity().getSupportFragmentManager().beginTransaction().add(R.id.rendered_fragment_container, renderedFrag).commit();
						}
						else
						{
							getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.rendered_fragment_container, renderedFrag).commit();
						}

			        } else {
			            // Single Pane layout and must swap frags...
			            Bundle args = new Bundle();
			            //args.putInt(ArticleFragment.ARG_POSITION, position);
			            renderedFrag.setArguments(args);
			            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

			            // Replace whatever is in the fragment_container view with this fragment,
			            // and add the transaction to the back stack so the user can navigate back
			            transaction.replace(R.id.fragment_container, renderedFrag);
			            transaction.addToBackStack(null);

			            // Commit the transaction
			            transaction.commit();
			        }
					if(elementType.contentEquals(Constants.GROUP))
					{
						
						GroupT renderMe = (GroupT)(clickedElement.getValue());
						renderedFrag.renderGroup(renderMe);
					}
					else if(elementType.contentEquals(Constants.PAGE))
					{
						
						PageT renderMe = (PageT)(clickedElement.getValue());
						renderedFrag.renderPage(renderMe);
					}
					else if(elementType.contentEquals(Constants.WINDOW))
					{
						
						WindowT renderMe = (WindowT)(clickedElement.getValue());
						renderedFrag.renderWindow(renderMe);
					}
					else if(elementType.contentEquals(Constants.DIALOG))
					{
						
						DialogT renderMe = (DialogT)(clickedElement.getValue());
						renderedFrag.renderDialog(renderMe);
					}
					
				}
	    	}
	   	}	
	    
	};
	
}
