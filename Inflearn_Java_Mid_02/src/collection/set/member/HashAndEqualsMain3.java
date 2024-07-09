package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(5);
        Member m1 = new Member("A");
        Member m2 = new Member("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1)); // 참조값
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2)); // 참조값


        set.add(m1);
        set.add(m2); // 중복 등록
        System.out.println(set);

        // 검색 성공
        Member searchValue = new Member("A");
        System.out.println("System.identityHashCode(searchValue) = " + System.identityHashCode(searchValue));
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
