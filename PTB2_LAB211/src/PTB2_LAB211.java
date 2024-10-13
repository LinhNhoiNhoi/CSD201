




                import java.util.Scanner;

                public class PTB2_LAB211 {

                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);

                        // Bước 1: Nhập giá trị của A, B, C
                        double A = inputDouble("Nhập giá trị A: ", sc);
                        double B = inputDouble("Nhập giá trị B: ", sc);
                        double C = inputDouble("Nhập giá trị C: ", sc);

                        // Bước 2: Kiểm tra hệ số A
                        if (A == 0) {
                            // Phương trình bậc nhất Bx + C = 0
                            if (B == 0) {
                                if (C == 0) {
                                    System.out.println("Phương trình có vô số nghiệm.");
                                } else {
                                    System.out.println("Phương trình vô nghiệm.");
                                }
                            } else {
                                double x = -C / B;
                                System.out.println("Phương trình có nghiệm: x = " + x);
                            }
                        } else {
                            // Bước 3: Tính delta
                            double delta = B * B - 4 * A * C;

                            // Bước 4: Dựa trên giá trị của delta, kết luận nghiệm
                            if (delta < 0) {
                                System.out.println("Phương trình vô nghiệm.");
                            } else if (delta == 0) {
                                double x = -B / (2 * A);
                                System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x);
                            } else {
                                double x1 = (-B + Math.sqrt(delta)) / (2 * A);
                                double x2 = (-B - Math.sqrt(delta)) / (2 * A);
                                System.out.println("Phương trình có hai nghiệm phân biệt:");
                                System.out.println("x1 = " + x1);
                                System.out.println("x2 = " + x2);
                            }
                        }

                        // Bước 5: Kết thúc chương trình
                        sc.close();
                    }

                    // Hàm nhập và kiểm tra số thực
                    public static double inputDouble(String prompt, Scanner sc) {
                        double num;
                        while (true) {
                            try {
                                System.out.print(prompt);
                                num = Double.parseDouble(sc.nextLine().trim());
                                break; // Thoát khỏi vòng lặp khi nhập đúng số thực
                            } catch (NumberFormatException e) {
                                System.err.println("Đây không phải là số thực. Vui lòng nhập lại.");
                            }
                        }
                        return num;
                    }
                }
