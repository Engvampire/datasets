package corgis.supreme_court.domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


/**
 * 
 */
public class Id {
	
    private String case_;
    private String vote;
    private String docket;
    private String caseIssues;
    
    
    /*
     * @return 
     */
    public String getCase_() {
        return this.case_;
    }
    
    
    
    /*
     * @return 
     */
    public String getVote() {
        return this.vote;
    }
    
    
    
    /*
     * @return 
     */
    public String getDocket() {
        return this.docket;
    }
    
    
    
    /*
     * @return 
     */
    public String getCaseIssues() {
        return this.caseIssues;
    }
    
    
    
	
	/**
	 * Creates a string based representation of this Id.
	
	 * @return String
	 */
	public String toString() {
		return "Id[" +case_+", "+vote+", "+docket+", "+caseIssues+"]";
	}
	
	/**
	 * Internal constructor to create a Id from a  representation.
	 * @param json_data The raw json data that will be parsed.
	 */
    public Id(JSONObject json_data) {
        try {// case
            this.case_ = (String)json_data.get("case");// vote
            this.vote = (String)json_data.get("vote");// docket
            this.docket = (String)json_data.get("docket");// case issues
            this.caseIssues = (String)json_data.get("case issues");
        } catch (NullPointerException e) {
    		System.err.println("Could not convert the response to a Id; a field was missing.");
    		e.printStackTrace();
    	} catch (ClassCastException e) {
    		System.err.println("Could not convert the response to a Id; a field had the wrong structure.");
    		e.printStackTrace();
        }
	}	
}