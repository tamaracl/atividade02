package examples.triangles;

import examples.fibonacci.Fibonacci;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrianglesTest {

    private Triangles triangles;

    @Before
    public void setUp() {
        triangles = new Triangles();
    }

    @Test
    public void testInexistente(){
        assertEquals("Inexistente", triangles.getType(0,0,0));
    }

    @Test
    public void testInexistente1(){
        assertEquals("Inexistente", triangles.getType(1,2,3));
    }

    @Test
    public void testEquilatero(){
        assertEquals("Equilatero", triangles.getType(2,2,2));
    }

    @Test
    public void testIsoceles(){
        assertEquals("Isoceles", triangles.getType(1,2,2));
    }

    @Test
    public void testEscaleno(){
        assertEquals("Escaleno", triangles.getType(7,3,5));
    }







}
