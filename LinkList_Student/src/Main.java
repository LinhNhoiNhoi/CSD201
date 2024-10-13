public class Main {
    public static void main(String[] args) {
        // Tạo danh sách
        MyList studentList = new MyList();

        // Thêm nhiều sinh viên vào danh sách
        Student[] students = {
            new Student("S1", "John", 8.5),
            new Student("S2", "Mary", 7.0),
            new Student("S3", "Alice", 9.0),
            new Student("S4", "Bob", 6.5)
        };
        studentList.addManyLast(students);

        // Duyệt qua danh sách
        System.out.println("Danh sách sinh viên:");
        studentList.travel();

        // Thêm sinh viên vào đầu danh sách
        System.out.println("Thêm sinh viên mới vào đầu danh sách:");
        studentList.AddFirst(new Student("S5", "Tom", 8.0));
        studentList.travel();

        // Xóa sinh viên đầu tiên
        System.out.println("Xóa sinh viên đầu tiên:");
        studentList.removeFirst();
        studentList.travel();

        // Xóa sinh viên cuối cùng
        System.out.println("Xóa sinh viên cuối cùng:");
        studentList.removeLast();
        studentList.travel();

        // Tìm sinh viên có điểm cao nhất
        Node maxNode = studentList.max();
        if (maxNode != null) {
            System.out.println("Sinh viên có điểm cao nhất: " + maxNode.infor.name + " - " + maxNode.infor.mark);
        }

        // Sắp xếp danh sách sinh viên theo điểm
        System.out.println("Sắp xếp sinh viên theo điểm:");
        studentList.bubbleSort();
        studentList.travel();

        // Đảo ngược danh sách
        System.out.println("Đảo ngược danh sách sinh viên:");
        studentList.reverse();
        studentList.travel();
    }
}
