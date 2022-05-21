package org.pytorch.helloworld;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;

public class ImageNetClasses {
  public static String[] IMAGENET_CLASSES = new String[]{
      "Cardiomegaly",
      "Edema",
      "Consolidation",
      "Atelectasis",
      "Pleural Effusion"
  };




  static float[] sigmoid(float[] data) {
    float[] arr = Arrays.copyOf(data, data.length);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (float) (1 / (1 + Math.exp(-arr[i])));

    };
    return arr;
  };

  static float[] binarizacion(float[] data, double threshold) {
    float[] arr = Arrays.copyOf(data, data.length);
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]>=threshold){
        arr[i]=1;
      }
      else{
        arr[i]=0;
      }
    }
    return arr;
  };



}
