package oops.objectClassDemos;

public class Feature {
    int featureId;
    String featureName;

    public Feature(int featureId, String featureName) {
        this.featureId = featureId;
        this.featureName = featureName;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "featureId=" + featureId +
                ", featureName='" + featureName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Feature feature = new Feature(1,"WhatsAPI Integration");
        System.out.println(feature);
        System.out.println(feature.toString());
    }
}
