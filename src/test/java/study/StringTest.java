package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    
    /*
     * "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
     * "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
     * 힌트
     * 배열로 반환하는 값의 경우 assertj의 contains()를 활용해 반환 값이 맞는지 검증한다.
     * 배열로 반환하는 값의 경우 assertj의 containsExactly()를 활용해 반환 값이 맞는지 검증한다.
    */
    @Nested
    class split {    	
    	@Test
    	void splitCase1() {
    		String[] actual = "1,2".split(",");
    		assertThat(actual).contains("1","2");
    	}
    	
    	@Test
    	void splitCase2() {
    		String[] actual2 = "1".split(",");
    		assertThat(actual2).containsExactly("1");
    	}
    }
    
    /*
     * "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
     */
    @Test
    void subString() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }
    
    /*
     * "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
		String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
		JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.
     * */
    @Nested
    class charAt{
    	@Test
    	@DisplayName("Index : 0")
    	void charAtSuccessTestCase1() {
    		Character actual = "abc".charAt(0);
    		assertThat(actual).isEqualTo('a');
    	}
    	@Test
    	@DisplayName("Index : 1")
    	void charAtSuccessTestCase2() {
    		Character actual = "abc".charAt(1);
    		assertThat(actual).isEqualTo('b');
    	}
    	@Test
    	@DisplayName("Index : 2")
    	void charAtSuccessTestCase3() {
    		Character actual = "abc".charAt(2);
    		assertThat(actual).isEqualTo('c');
    	}
    	@Test
    	@DisplayName("Index : 5")
    	void charAtFailTestCase() {
    		assertThatThrownBy(()->{
    			Character actual4 = "abc".charAt(5);
    			assertThat(actual4).isEqualTo('c');
    		}).isInstanceOf(IndexOutOfBoundsException.class).hasMessage("index : 5");
    	}
    }
}


