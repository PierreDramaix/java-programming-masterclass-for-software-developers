public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double wallArea =  width * height;
        double bucketNeeded = Math.ceil(wallArea / areaPerBucket);
        double bucketToBuy = bucketNeeded - extraBuckets;

        return (int) bucketToBuy;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double wallArea =  width * height;
        double bucketNeeded = Math.ceil(wallArea / areaPerBucket);

        return (int) bucketNeeded;

    }

    public static int getBucketCount(double area, double areaPerBucket){

        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double bucketNeeded = Math.ceil(area / areaPerBucket);

        return (int) bucketNeeded;
    }


}
