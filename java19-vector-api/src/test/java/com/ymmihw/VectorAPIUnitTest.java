package com.ymmihw;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VectorAPIUnitTest {
  VectorAPIExamples vector = new VectorAPIExamples();

  @Test
  public void whenTwoArraysProvided_thenVerifyScalarAdd() {
    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {100, 200, 300, 400};
    int[] result = {101, 202, 303, 404};
    assertArrayEquals(result, vector.addTwoScalarArrays(arr1, arr2));
  }

  @Test
  public void whenTwoArraysProvided_thenVerifyVectorAdd1() {
    int[] arr1 = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4};
    int[] arr2 = {100, 200, 300, 400, 100, 200, 300, 400, 100, 200, 300, 400, 100, 200, 300, 400};
    int[] result = {101, 202, 303, 404, 101, 202, 303, 404, 101, 202, 303, 404, 101, 202, 303, 404};
    assertArrayEquals(result, vector.addTwoVectorArrays(arr1, arr2));
  }

  @Test
  public void whenTwoArraysProvided_thenVerifyVectorAdd() {
    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {100, 200, 300, 400};
    int[] result = {101, 202, 303, 404};
    assertArrayEquals(result, vector.addTwoVectorsWithMasks(arr1, arr2));
  }

  @Test
  public void whenTwoValuesProvided_thenComputeScalarNorm() {
    float[] arr1 = {1, 2.3f};
    float[] arr2 = {1.3f, 2.0f};
    float[] result = {-2.6899998f, -9.29f};
    assertArrayEquals(result, vector.scalarNormOfTwoArrays(arr1, arr2));
  }

  @Test
  public void whenTwoValuesProvided_thenComputeVectorNorm() {
    float[] arr1 = {1, 2.3f};
    float[] arr2 = {1.3f, 2.0f};
    float[] result = {-2.6899998f, -9.29f};
    assertArrayEquals(result, vector.vectorNormalForm(arr1, arr2));
  }

  @Test
  public void whenArrayProvided_thenComputeVectorAverage() {
    int[] arr = {100, 200, 300, 400};
    Assertions.assertEquals(250.0, vector.averageOfaVector(arr));
  }
}
