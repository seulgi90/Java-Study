package ch11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List {

  Object[] data = null; // 객체를 담기 위한 객체배열 선언
  int capacity = 0; // 용량
  int size = 0; // 크기

  public MyVector(int capacity) throws IllegalAccessException {

    if (capacity < 0) {
      throw new IllegalAccessException("유효하지 않은 값입니다. : " + capacity);
    }
  }

  public MyVector() throws IllegalAccessException {
    this(10);
  }

  // 최소한의 저장 공간 (capacity)를 확보하는 메서드
  public void ensureCapacity(int minCapacity) {
    if (minCapacity - data.length > 0) {
      setCapacity(minCapacity);
    }
  }

  private void setCapacity(int capacity) {
    if (this.capacity == capacity)
      return; // 크기가 같으면 변경하지 않는다

    Object[] tmp = new Object[capacity];
    System.arraycopy(data, 0, tmp, 0, size);
    // System.arraycopy(원본 배열, 원본 배열의 복사 시작 위치, 복사할 배열, 복사 할 배열의 복사 시작 위치, 복사할 요소의 개수);
  }

  @Override
  public boolean add(Object obj) {
    // 새로운 객체를 저장하기 전에 저장할 공간을 확보한다
    ensureCapacity(size+1);
    data[size++] = obj;
    return true;
  }

  @Override
  public Object get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
    return null;
  }

  @Override
  public Object remove(int index) {

    Object oldObj = null;

    if (index < 0 || index >= size) 
      throw new IndexOutOfBoundsException("범위를 벗어났습니다");
    oldObj = data[index];


    return null;
  }


  @Override
  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean contains(Object o) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Iterator iterator() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object[] toArray() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object[] toArray(Object[] a) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean remove(Object o) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean containsAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean addAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean addAll(int index, Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean removeAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean retainAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub

  }



  @Override
  public Object set(int index, Object element) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void add(int index, Object element) {
    // TODO Auto-generated method stub

  }

  @Override
  public int indexOf(Object o) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int lastIndexOf(Object o) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public ListIterator listIterator() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ListIterator listIterator(int index) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List subList(int fromIndex, int toIndex) {
    // TODO Auto-generated method stub
    return null;
  }



}
