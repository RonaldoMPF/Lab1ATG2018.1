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

    @Test
    public void connectAndGetConnectionsTest (){
        v1.connect(v2);
        v1.connect(v3);
        Assert.assertTrue(v1.getConnections().contains(v2));
        Assert.assertTrue(v1.getConnections().contains(v3));
        Assert.assertFalse(v1.getConnections().contains(v4));
        Assert.assertFalse(v2.getConnections().contains(v2));
        Assert.assertFalse(v2.getConnections().contains(v3));
        Assert.assertFalse(v2.getConnections().contains(v4));
        v2.connect(v1);
        v2.connect(v2);
        v2.connect(v3);
        v2.connect(v4);
        Assert.assertTrue(v2.getConnections().contains(v1));
        Assert.assertTrue(v2.getConnections().contains(v2));
        Assert.assertTrue(v2.getConnections().contains(v3));
        Assert.assertTrue(v2.getConnections().contains(v4));
    }

    @Test
    public void getDataAndSetDataTest () {
        Assert.assertEquals(v1.getData(), new Integer (1));
        Assert.assertEquals(v2.getData(), new Integer (2));
        Assert.assertEquals(v3.getData(), new Integer (3));
        Assert.assertEquals(v4.getData(), new Integer (4));
        Assert.assertNotEquals(v1.getData(), new Integer (5));
        v1.setData(8);
        v2.setData(10);
        Assert.assertNotEquals(v1.getData(), new Integer (1));
        Assert.assertNotEquals(v2.getData(), new Integer (2));
    }

}