package graphLibrary;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VertexTest {

    Vertex<Integer> v1;
    Vertex<Integer> v2;
    Vertex<Integer> v3;
    Vertex<Integer> v4;

    @Before
    public void createVertex (){
        v1 = new Vertex<Integer>(1);
        v2 = new Vertex<Integer>(2);
        v3 = new Vertex<Integer>(3);
        v4 = new Vertex<Integer>(4);
    }


}