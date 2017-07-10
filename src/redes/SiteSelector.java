package redes;

import java.applet.AppletContext;
import java.awt.BorderLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SiteSelector extends JApplet{
		
	private HashMap <Object, URL> sites;
	private ArrayList<String> siteNames;
	private JList siteChooser;
	
	public void init()
	{
		sites = new HashMap <Object, URL> ();
		siteNames = new ArrayList <String> ();
		
		getSitesFromHTMLParameters();
		
		add( new JLabel("Chooser a site to browser"), BorderLayout.NORTH);
		
		siteChooser = new JList (siteNames.toArray());
		siteChooser.addListSelectionListener( new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				Object object = siteChooser.getSelectedValue();
				
				URL newDocument = sites.get( object );
				
				AppletContext browser = getAppletContext();
				
				browser.showDocument(newDocument);
				
			}
		}
			);
		
		add(new JScrollPane( siteChooser ), BorderLayout.CENTER);
	}

	private void getSitesFromHTMLParameters() {
		
		
		
	}	
}
