// Một số ghi chú về biến trong JS

/**
 * 1. Các từ khóa 
 * 
 * - var: phạm vi hàm và phạm vi toàn cục
 * - let: phạm vi khối
 * - const: phạm vi khối && không thể gán lại (hằng số)
 * 
 * 2. Các kiểu dữ liệu
 * 
 * 2.1. Nguyên thủy: Number, String, boolean, undefined (biến đã được khai báo nhưng chưa gán giá trị),
 * null (sự thiếu dữ liệu), Symbol: Những giá trị duy nhất, không thay đổi (key của dictionary)
 * bigInt: Số nguyên lớn
 * 
 * 
 * 2.2. Kiểu dữ liệu Object: Mảng, đối tượng và hàm
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

// Chuyển đổi chuỗi thành số

let n = Number("123")
console.log(n);
console.log(typeof n);

let s = String(n)
console.log(s);
console.log(typeof s);
