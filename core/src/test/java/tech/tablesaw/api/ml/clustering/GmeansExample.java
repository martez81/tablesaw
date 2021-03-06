package tech.tablesaw.api.ml.clustering;

import java.util.Arrays;

import tech.tablesaw.api.Table;
import tech.tablesaw.api.ml.clustering.Gmeans;

/**
 * An example program illustrating the use of X-means clustering
 */
public class GmeansExample {

    public static void main(String[] args) throws Exception {

        Table t = Table.read().csv("../data/whiskey.csv");

        Gmeans model = new Gmeans(
                10,
                t.nCol(2),
                t.nCol(3),
                t.nCol(4),
                t.nCol(5),
                t.nCol(6),
                t.nCol(7),
                t.nCol(8),
                t.nCol(9),
                t.nCol(10),
                t.nCol(11),
                t.nCol(12),
                t.nCol(13)
        );

        out("Distortion: " + model.distortion());
        out("Cluster count: " + model.getClusterCount());
        out(Arrays.toString(model.getClusterLabels()));
        out(Arrays.toString(model.getClusterSizes()));
        out(model.labeledCentroids());
    }

    private static void out(Object object) {
        System.out.println(String.valueOf(object));
    }

}