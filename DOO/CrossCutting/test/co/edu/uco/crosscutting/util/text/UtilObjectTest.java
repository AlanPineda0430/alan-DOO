package co.edu.uco.crosscutting.util.text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uco.crosscutting.util.object.UtilObject;

class UtilObjectTest {

	@Test
	void validateIfObjectIsNull() {
		// arrange
		Object value = null;
		
		//act
		boolean result = UtilObject.getUtilObject().isNull(value);
		
		//assert
		assertTrue(result);
	
	}
	
	void validateIfObjectIsNotNull() {
		// arrange
		Object value = new Object();
				
		//act
		boolean result = UtilObject.getUtilObject().isNull(value);
				
		//assert
		assertFalse(result);
	}
	
	void validateIfNotNullObjectIsEqualToOriginal() {
		// arrange
		Object value = new Object();
		Object defaultValue = new Object();
				
		//act
		Object result = UtilObject.getUtilObject().getDefault(value, defaultValue);
				
		//assert
		assertTrue(value.equals(result));
	}
	
	@SuppressWarnings("null")
	void validateIfObjectIsEqualToDefaultObjectWhenOriginalObjectIsNull() {
		// arrange
		Object value = null;
		Object defaultValue = new Object();
				
		//act
		Object result = UtilObject.getUtilObject().getDefault(value, defaultValue);
				
		//assert
		assertTrue(value.equals(result));
	}


}
