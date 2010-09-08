package athos.measure;

import junit.framework.Assert;

import org.junit.Test;

import athos.model.Episode;

public class TDDMeasureTest {
	
	
	@Test
	public void contextIndependentCase() throws Exception {
		
		Episode e1 = new Episode();
		e1.setClassification("test-first", "1");
		
		Episode e2 = new Episode();
		e2.setClassification("test-first", "1");
		
		Episode e3 = new Episode();
		e3.setClassification("test-last", "1");
		
		Episode e4 = new Episode();
		e4.setClassification("test-first", "1");
		
		Episode[] episodes = new Episode[]{e1,e2,e3,e4};
		
		TDDMeasure measure = new TDDMeasure();
		measure.measure(episodes);
		
		Assert.assertEquals(0.75, measure.getTDDPercentageByNumber(), 0.0001);
		
	}
	
	@Test
	public void contextDependentCase() throws Exception {
		
		Episode e1 = new Episode();
		e1.setClassification("test-first", "1");
		
		Episode e2 = new Episode();
		e2.setClassification("refactoring", "1");
		
		Episode e3 = new Episode();
		e3.setClassification("test-adition", "1");
		
		Episode e4 = new Episode();
		e4.setClassification("test-first", "1");
		
		Episode[] episodes = new Episode[]{e1,e2,e3,e4};
		
		TDDMeasure measure = new TDDMeasure();
		measure.measure(episodes);
		
		Assert.assertEquals(0.75, measure.getTDDPercentageByNumber(), 0.0001);
		
	}
	
	
}
