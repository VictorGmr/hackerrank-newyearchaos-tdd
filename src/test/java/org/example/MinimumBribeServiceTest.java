package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MinimumBribeServiceTest {
    @Test
    public void shouldExecute() {
        MinimumBribeService service = new MinimumBribeService();

        List<Integer> q = new ArrayList<>();

        service.execute(q);
    }

    @Test
    public void shouldCallGetMinimumBribes() {
        MinimumBribeService service = new MinimumBribeService();

        List<Integer> q = new ArrayList<>();

        String response = service.getMinimumBribes(q);
    }

    @Test
    public void shouldReturnTooChaotic_whenGetMinimumBribes3Bribes() {
        MinimumBribeService service = new MinimumBribeService();

        List<Integer> q = new ArrayList<>(List.of(4, 1, 2, 3));

        assertEquals("Too chaotic", service.getMinimumBribes(q));
    }

    @Test
    public void shouldReturnTooChaotic_whenGetMinimumBribes4Bribes() {
        MinimumBribeService service = new MinimumBribeService();

        List<Integer> q = new ArrayList<>(List.of(5, 1, 2, 3, 4));

        assertEquals("Too chaotic", service.getMinimumBribes(q));
    }

    @Test
    public void shouldReturnMinimumBribes_whenGetMinimumBribesLessThan2BribesPerPerson() {
        MinimumBribeService service = new MinimumBribeService();

        List<Integer> q = new ArrayList<>(List.of(1, 2, 5, 3, 7, 8, 6, 4));

        assertEquals("7", service.getMinimumBribes(q));
    }
}