package ch11;

public class MyVectorQuize {

  Object[] objArr;

  int size = 0; // 객체의 개수 저장 = 저장된 개수

  public MyVectorQuize() {
    objArr = new Object[20];
  }

  int size() {
    return size; // 변수 값 반환
  }

  int capacity() {
    return objArr.length;
  }

  boolean isEmpty() {
    return size == 0; // 객체의 수 0 이면 true 반환
  }

  void add(Object obj) { // 객체를 추가하는 메서드 -> 새 배열에 저장하는 거 필요??

    if (size >= objArr.length) {
      sizeUp(); // 배열 길이 늘리는 메서드 호출
    }

    objArr[size] = obj; // 새로운 객체를 배열에 추가
    size++; // 개수 증가
  }

  void sizeUp() { // 배열 길이 증가 메서드

    int newCapacity = objArr.length * 2; // 새 배열 길이

    Object[] newArr = new Object[newCapacity];

    for (int i = 0; i < objArr.length; i++) {
      newArr[i] = objArr[i];
    }
    objArr = newArr;
  }

  int indexOf(Object obj) {

    for (int i = 0; i < size; i++) {
      if (objArr[i] != null && objArr[i].equals(obj)) {
        return i;
      }
    }
    return -999; // 찾는 객체가 없을 경우
  }

  boolean remove(Object obj) {

    int index = indexOf(obj); // 해당 인덱스 값

    if (index == -999)  return false;  // if (index != -1) 로 작성한 코드였으나 수정 

    for (int i = index; i < size - 1; i++) {
      objArr[i] = objArr[i + 1]; // 한칸씩 앞으로 채워주기
    }

    // 마지막 객체부터 삭제하는 경우 (배열 복사 발생 안함)
    objArr[size - 1] = null; // 삭제 할 마지막 값
    size--;  // 데이터가 삭제되어 데이터의 개수가 줄었으므로 size의 값을 감소 시킨다

    return true; // 삭제 성공
  }




}
