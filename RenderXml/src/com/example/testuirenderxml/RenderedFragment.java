package com.example.testuirenderxml;




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
import org.fdi._2010.client.PageT;
import org.fdi._2010.client.ParameterT;
import org.fdi._2010.client.PluginT;
import org.fdi._2010.client.TableT;
import org.fdi._2010.client.UiTemplateT;
import org.fdi._2010.client.WindowT;

import ae.javax.xml.bind.JAXBElement;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RenderedFragment extends Fragment{

	private FragmentTabHost mTabHost;
	private int pageCount=0;
	private String pageTabSpec = null;
	
	public RenderedFragment()
	{
		
	}
	@Override
	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
		
	}
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		mTabHost=new FragmentTabHost(getActivity());
		mTabHost.setup(getActivity(), getActivity().getSupportFragmentManager());
	}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
		return mTabHost;
    }

    @Override
    public void onStart() {
        super.onStart();

      
    }

   
	public void renderGroup(GroupT group)
   	{
   		System.out.println("\n	Rendering Group : "+ group.getLabel());
   		GroupT.ItemList groupItemList=group.getItemList();
   		List<JAXBElement<?>> groupItems=groupItemList.getWindowOrDialogOrPage();
   		callAptRenderMethod(groupItems);
   	}
   	
   	public void renderPage(PageT page)
   	{
   		System.out.println("\n	Rendering Page : "+page.getLabel()+" in a new tab!");
   		
   		//A new tab has to be added
   		pageCount++;
   		pageTabSpec=new String("PageFragment"+pageCount);
   		mTabHost.addTab(mTabHost.newTabSpec(pageTabSpec).setIndicator(page.getLabel()),PageFragment.class,null);
   		PageT.ItemList pageItemList=page.getItemList();
   		List<JAXBElement<?>> pageItems=pageItemList.getWindowOrDialogOrPage();
   		callAptRenderMethod(pageItems);
   	}
   	
   	public void renderWindow(WindowT window)
   	{
   		System.out.println("\n	Rendering Window : "+window.getLabel());
   		WindowT.ItemList windowItemList=window.getItemList();
   		List<JAXBElement<?>> windowItems=windowItemList.getWindowOrDialogOrPage();
   		callAptRenderMethod(windowItems);
   	}

   	public void renderDialog(DialogT dialog)
   	{
   		System.out.println("\n	Rendering Dialog : "+dialog.getLabel());
   		DialogT.ItemList dialogItemList=dialog.getItemList();
   		List<JAXBElement<?>> dialogItems=dialogItemList.getWindowOrDialogOrPage();
   		callAptRenderMethod(dialogItems);
   		
   	}
   	
   	public void callAptRenderMethod(List<JAXBElement<?>> items)
   	{
   		JAXBElement<?> item;
   		String itemType;
   		ParameterT parameter;
   		ActionT action;
   		WindowT window;
   		PageT page;
   		GroupT group;
   		DialogT dialog;
   		TableT table;
   		ChartT chart;
   		GraphT graph;
   		GridT grid;
   		ImageT image;
   		PluginT plugin;
   		
   		for(int i=0;i<items.size();i++)
   		{
   			item=items.get(i);
   			itemType=item.getDeclaredType().toString();
   			if(itemType.contentEquals(Constants.PARAMETER))
   			{
   				parameter=(ParameterT)item.getValue();
   				renderParam(parameter);				
   			}
   			else if(itemType.contentEquals(Constants.ACTION))
   			{
   				action=(ActionT)item.getValue();
   				renderButton(action);
   			}
   			else if(itemType.contentEquals(Constants.WINDOW))
   			{
   				window=(WindowT)item.getValue();
   				renderWindow(window);
   			}
   			else if(itemType.contentEquals(Constants.PAGE))
   			{
   				page=(PageT)item.getValue();
   				renderPage(page);
   			}
   			else if(itemType.contentEquals(Constants.DIALOG))
   			{
   				dialog=(DialogT)item.getValue();
   				renderDialog(dialog);
   			}
   			else if(itemType.contentEquals(Constants.GROUP))
   			{
   				group=(GroupT)item.getValue();
   				renderGroup(group);
   			}
   			else if(itemType.contentEquals(Constants.GRAPH))
   			{
   				graph=(GraphT)item.getValue();
   				renderGraph(graph);
   			}
   			else if(itemType.contentEquals(Constants.CHART))
   			{
   				chart=(ChartT)item.getValue();
   				renderChart(chart);
   			}
   			else if(itemType.contentEquals(Constants.TABLE))
   			{
   				table=(TableT)item.getValue();
   				renderTable(table);
   			}
   			else if(itemType.contentEquals(Constants.IMAGE))
   			{
   				image=(ImageT)item.getValue();
   				renderImage(image);
   			}
   			
   		}
   	}
   	
   	public static void renderParam(ParameterT parameter)
   	{
   		String paramName = parameter.getLabel();
   		UiTemplateT uiTemplate=parameter.getUITemplate();
   		HandlingT handling= parameter.getHandling();
   		if(uiTemplate==null)
   		{
   			System.out.println("A simple EditText : "+paramName);
   		}
   		else
   		{
   			System.out.println("A simple DropDown List : "+paramName);
   			EnumerationItemListT enumList=uiTemplate.getEnumeration();
   			List<EnumerationItemT> enumItems=enumList.getEnumerationItem();
   			for(int i=0;i<enumItems.size();i++)
   			{
   				
   			}
   		}
   	}
   	
   	public static void renderButton(ActionT action)
   	{
   		System.out.println("Button : "+action.getName());
   	}
   	
   	public static void renderGraph(GraphT graph)
   	{
   		System.out.println("Graph : "+graph.getLabel());
   	}
   	
   	public static void renderChart(ChartT chart)
   	{
   		System.out.println("Chart : "+chart.getLabel());
   	}
   	
   	public static void renderImage(ImageT image)
   	{
   		System.out.println("Image : "+image.getLabel());
   	}
   	
   	public static void renderGrid(GridT grid)
   	{
   		System.out.println("Grid");
   	}
   	
   	public static void renderTable(TableT table)
   	{
   		System.out.println("Table : "+table.getLabel());
   	}
  
	
}
