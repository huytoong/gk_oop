section .data
    M dw 1 ; Khởi tạo giá trị M
    N dw 5 ; Khởi tạo giá trị N

section .text
    global _start

_start:
    mov cx, [M] ; Đọc giá trị M
    mov dx, [N] ; Đọc giá trị N
    sub ax, ax ; Đặt AX = 0 để lưu tổng

LOOP_START: ; Đánh dấu bắt đầu vòng lặp
    add ax, cx ; Cộng giá trị hiện tại của CX vào tổng
    inc cx ; Tăng CX lên 1
    cmp cx, dx ; So sánh CX với N
    jle LOOP_START ; Nếu CX <= N, quay lại LOOP_START

; Khi kết thúc vòng lặp, AX sẽ chứa tổng từ M đến N
; Bây giờ bạn có thể thêm mã để in kết quả hoặc làm gì đó với nó