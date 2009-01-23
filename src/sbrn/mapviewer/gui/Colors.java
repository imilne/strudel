package sbrn.mapviewer.gui;

import java.awt.*;

public class Colors
{
	//colours for links
	public static Color linkColour = new Color(120,120,120);	
	public static Color strongEmphasisLinkColour = Color.red;	
	public static Color mildEmphasisLinkColour =  new Color(0,140,0);

	//genomes and chromosomes
	public static Color targetGenomeColour = new Color(80,0,0);
	public static Color referenceGenomeColour = new Color(0, 50, 155);
	public static Color outlineColour = Color.white;
	public static Color chromosomeCenterColour = new Color(130, 130, 130);	
	public static Color chromosomeInversionColour = new Color(0,36,18);

	//various labels
	public static Color chromosomeIndexColour = Color.white;
	public static Color featureLabelColour = Color.white;
	public static Color genomeLabelPanelColour = new Color(170, 170, 170);
	public static Color distanceMarkerColour = new Color(140,140,150);

	//features
	public static Color featureColour = new Color(120,120,120);
	public static Color highlightedFeatureColour = new Color(0,140,0);
	public static Color highlightedFeatureLabelColour = Color.white;	
	public static Color foundFeatureLabelBackgroundColour = Color.lightGray;	
	public static Color highlightedFeatureLabelBackgroundColour = new Color(120, 0,0);
	
	//regions
	public static Color highlightedFeatureRegionColour = new Color(30,0,0);	
	public static Color panZoomRectOutlineColour = Color.red;	
	public static Color panZoomRectFillColour = new Color(1f, 1f, 1f, 0.25f);
	public static Color selectionRectOutlineColour = Color.green;	
	public static Color selectionRectFillColour = new Color(1f, 1f, 1f, 0.25f);

	//overview canvas
	public static Color overviewCanvasTransparentPaint = new Color(1,1,1,0.25f);
	public static Color overviewCanvasSelectionRectColour = Color.red;
	public static Color  overviewCanvasBackgroundColour = Color.white;
	
	//main canvas
	public static Color mainCanvasBackgroundColour = Color.black;
	public static Color backgroundGradientStartColour = Color.black;
	public static Color backgroundGradientEndColour = new Color(110, 110, 110);	
	public static Color mainCanvasBottomBorderColour = new Color(80, 80, 80);
	
}
