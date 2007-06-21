package com.bretth.osm.osmosis.task;


/**
 * Defines the interface for tasks producing OSM data types.
 * 
 * @author Brett Henderson
 */
public interface Source extends Task {
	
	/**
	 * Sets the osm sink to send data to.
	 * 
	 * @param sink
	 *            The sink for receiving all produced data.
	 */
	void setSink(Sink sink);
}