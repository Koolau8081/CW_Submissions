public boolean firstLast6(int[] nums) {
  if(nums[0] == 6 || nums[nums.length - 1] == 6) {
    return true;
  }
  return false;
}

public boolean sameFirstLast(int[] nums) {
  if(nums.length >= 1 && nums[0] == nums[nums.length -1]){
    return true;
  }
  return false;
}

public int[] makePi() {
  int[] threeDigitsOfPi = {3, 1, 4};
  return threeDigitsOfPi;
}

public boolean commonEnd(int[] a, int[] b) {
  if(a[0] == b[0] || a[a.length -1] == b[b.length -1]){
    return true;
  } 
  return false;
}

public int sum3(int[] nums) {
  int numsAdd = nums[0] + nums[1] + nums[2];
  return numsAdd;
}
