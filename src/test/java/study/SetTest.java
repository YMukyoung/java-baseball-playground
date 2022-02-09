package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
  private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }
    
    // Test Case ����
    
    @Nested
    class setTest {
    	/*
    	 * Set�� size() �޼ҵ带 Ȱ���� Set�� ũ�⸦ Ȯ���ϴ� �н��׽�Ʈ�� �����Ѵ�.
    	 * */
    	@Test
    	void size() {
    		int setSize = numbers.size();
    		assertThat(setSize).isEqualTo(3);
    	}
    	
    	/*Set�� contains() �޼ҵ带 Ȱ���� 1, 2, 3�� ���� �����ϴ����� Ȯ���ϴ� �н��׽�Ʈ�� �����Ϸ��Ѵ�.
    	 *�����ϰ� ���� ������ ���� �ߺ� �ڵ尡 ����ؼ� �߻��Ѵ�.
    	 *JUnit�� ParameterizedTest�� Ȱ���� �ߺ� �ڵ带 ������ ����.*/
    	@ParameterizedTest
    	@ValueSource(ints = {1,2,3})
    	void containsOnlyTrue(int ints) {
    		assertThat(numbers.contains(ints)).isTrue();
    	}
    	
    	@ParameterizedTest
    	@CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    	void containsTrueOrFalse(int input, boolean expected) {
    		assertEquals(numbers.contains(input), expected);
    	}
    }
}