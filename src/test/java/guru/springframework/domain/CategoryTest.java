package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class CategoryTest {
    Category category;
    private Long idValue;

    public CategoryTest(Long idValue) {
        this.idValue = idValue;
    }

    @Parameterized.Parameters
    public static Collection<Long> inputData(){
        return List.of(1L, 2L, 3L);
    }

    @Before
    public void setUp() {
        category = new Category();
    }


    @Test
    public void getId() {
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }
}