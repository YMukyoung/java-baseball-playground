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
     * "1,2"�� ,�� split ���� �� 1�� 2�� �� �и��Ǵ��� Ȯ���ϴ� �н� �׽�Ʈ�� �����Ѵ�.
     * "1"�� ,�� split ���� �� 1���� �����ϴ� �迭�� ��ȯ�Ǵ����� ���� �н� �׽�Ʈ�� �����Ѵ�.
     * ��Ʈ
     * �迭�� ��ȯ�ϴ� ���� ��� assertj�� contains()�� Ȱ���� ��ȯ ���� �´��� �����Ѵ�.
     * �迭�� ��ȯ�ϴ� ���� ��� assertj�� containsExactly()�� Ȱ���� ��ȯ ���� �´��� �����Ѵ�.
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
     * "(1,2)" ���� �־����� �� String�� substring() �޼ҵ带 Ȱ���� ()�� �����ϰ� "1,2"�� ��ȯ�ϵ��� �����Ѵ�.
     */
    @Test
    void subString() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }
    
    /*
     * "abc" ���� �־����� �� String�� charAt() �޼ҵ带 Ȱ���� Ư�� ��ġ�� ���ڸ� �������� �н� �׽�Ʈ�� �����Ѵ�.
		String�� charAt() �޼ҵ带 Ȱ���� Ư�� ��ġ�� ���ڸ� ������ �� ��ġ ���� ����� StringIndexOutOfBoundsException�� �߻��ϴ� �κп� ���� �н� �׽�Ʈ�� �����Ѵ�.
		JUnit�� @DisplayName�� Ȱ���� �׽�Ʈ �޼ҵ��� �ǵ��� �巯����.
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


