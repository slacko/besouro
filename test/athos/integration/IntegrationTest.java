package athos.integration;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.junit.Test;
import org.mockito.Mockito;

import athos.listeners.JavaStatementMeter;
import athos.listeners.JavaStructureChangeListener;
import athos.listeners.ResourceChangeListener;
import athos.model.CompilationAction;
import athos.model.EditAction;
import athos.model.UnitTestAction;
import athos.model.refactor.RefactorOperator;
import athos.model.refactor.RefactorSubjectType;
import athos.model.refactor.UnaryRefactorAction;
import athos.stream.EpisodeClassifierStream;

public class IntegrationTest {

	@Test 
	public void testTDDEpisodeCategory1() throws Exception {
	
		
		EpisodeClassifierStream stream = new EpisodeClassifierStream();
		JavaStructureChangeListener javaListener = new JavaStructureChangeListener(stream);
		ResourceChangeListener resourceListener = new ResourceChangeListener(stream);
		
		JavaStatementMeter meter = Mockito.mock(JavaStatementMeter.class);
		javaListener.setTestCounter(meter);
		resourceListener.setTestCounter(meter);
		
		ElementChangedEvent event = JavaElementsFactory.createAddMethodAction();
		javaListener.elementChanged(event);
		// unaryAction.setSubjectName("void testEquilateral()");

		
		IResourceChangeEvent resourceEvent = ResourceFactory.createTestEditAction();
		resourceListener.resourceChanged(resourceEvent);
//	    EditAction editAction = new EditAction(clock, testFile, 123);

		//
//	    // Compile error on test
//	    CompilationAction compilationAction = new CompilationAction(clock, testFile);
//	    compilationAction.setErrorMessage("Unknown data type");
//	    compilationAction.assertJessFact(3, engine);
//
//	    // Work on production code
//	    editAction = new EditAction(clock, productionFile, 200);
//	    editAction.setIsTestEdit(false);
//	    editAction.setFileSizeIncrease(10);
//	    editAction.assertJessFact(4, engine);
//
//	    // Unit test failue
//	    UnitTestAction unitTestAction = new UnitTestAction(clock, testFile); 
//	    unitTestAction.setFailureMessage("Failed to import");
//	    unitTestAction.assertJessFact(5, engine);
//	 
//	    // Edit on prodction code
//	    editAction = new EditAction(clock, productionFile, 199);
//	    editAction.setIsTestEdit(false);
//	    editAction.setFileSizeIncrease(30);
//	    editAction.assertJessFact(6, engine);
//
//	    // Unit test pass
//	    unitTestAction = new UnitTestAction(clock, testFile); 
//	    unitTestAction.assertJessFact(7, engine);

		  
	  }
	
}
