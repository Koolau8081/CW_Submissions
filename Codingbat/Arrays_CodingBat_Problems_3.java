public boolean has23(int[] nums) {
 boolean isTrue = false;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2 || nums[i] == 3){
      isTrue = true;
    }
    
  }
  return isTrue;
}

public boolean no23(int[] nums) {
   boolean isTrue = true;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2 || nums[i] == 3){
      isTrue = false;
    }
    
  }
  return isTrue;
}

public int[] makeLast(int[] nums) {
  int[] arr = new int[nums.length * 2];
  arr[arr.length -1] = nums[nums.length -1];
  
  return arr;
  
}

public boolean double23(int[] nums) {
 int count2 = 0;
 int count3 = 0;
 
 boolean is23 = false;
 
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2){
      count2++;
    }
    if(nums[i] == 3){
      count3++;
    }
  }
  
  if(count2 >= 2 || count3 >= 2){
    is23 = true;
  }
  
  return is23;
}

public int[] fix23(int[] nums) {
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2 && nums[i+1] == 3){
      nums[i+1] = 0;
    }
  }
  
  return nums;
}

public int start1(int[] a, int[] b) {
  int count = 0;
  if(a.length > 0){
    if(a[0] == 1){
      count++;
    }
  }
  if(b.length > 0){
    if(b[0] == 1){
      count++;
    }
  } 
  return count;
}

public int[] biggerTwo(int[] a, int[] b) {
  int sumA;
  int sumB;
  
  sumA = a[0] + a[1];
  sumB = b[0] + b[1];
  
  if(sumA >= sumB){
    return a;
  }
  
  else{
    return b;
  }
  
}

public int[] makeMiddle(int[] nums) {
  int[] arr = new int[2];
  arr[0] = nums[(nums.length-1) / 2];
  arr[1] = nums[((nums.length-1) / 2) +1];
  return arr;
}

public int[] plusTwo(int[] a, int[] b) {
  int[] arr = new int[a.length + b.length];
  arr[0] = a[0];
  arr[1] = a[1];
  arr[2] = b[0];
  arr[3] = b[1];
  
  return arr;
}

public int[] swapEnds(int[] nums) {
  int holder = nums[0];
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = holder;
  return nums;
}

public int[] midThree(int[] nums) {
  int[] arr = new int[3];
  int midNum = (nums.length + 1) / 2;
  arr[0] = nums[midNum-2];
  arr[1] = nums[midNum - 1];
  arr[2] = nums[midNum];
  
  return arr;
}
