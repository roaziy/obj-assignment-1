# Агуулахын Удирдлагын Систем
- B241940029 А.Эрхэмтөр (Семинар 3|2)
- B242270047 Б.Төгөлдөр (Семинар 3|2)
- B241910014 Б.Намуунаа (Семинар 4|3)

## 1. Танилцуулга
Энэхүү тайлан нь Java хэл дээр хөгжүүлсэн Агуулахын Удирдлагын Системийн загвар, үйл ажиллагааг тайлбарлаж байна. Систем нь агуулах дахь барааны нөөцийг хянах, барааны хөдөлгөөнийг (орлого болон зарлага) бүртгэх, мөн тодорхой хугацаанд хийсэн гүйлгээний тайлан үүсгэх боломжтой. Систем нь хэрэглэгчдэд агуулахын үйл ажиллагааг удирдах боломжийг олгоно.

## 2. Системийн Оргил Компонентууд
Систем нь дараах 5 үндсэн компонентаас бүрдэнэ:

### **Product (Бүтээгдэхүүн) Класс**
- **Шинж чанар**: `productId`, `name`, `quantity`
- **Аргууд**: Эдгээр шинж чанарыг авах болон өөрчлөх функцууд

### **Transaction (Гүйлгээ) Класс**
- **Шинж чанар**: `transactionId`, `date`, `product`, `quantity`, `type` (орлого эсвэл зарлага)
- **Аргууд**: Эдгээр шинж чанарыг авах функцууд

### **Clerk (Нярав) Класс**
- **Шинж чанар**: `name`, `warehouse`
- **Аргууд**:
  - `receiveStock(Product product, int quantity)`: Бараа хүлээн авах
  - `releaseStock(Product product, int quantity)`: Бараа гаргах
  - `generateReport(Date startDate, Date endDate)`: Тайлан үүсгэх

### **Warehouse (Агуулах) Класс**
- **Шинж чанар**: `warehouseId`, `location`, `inventory`, `transactions`, `clerks`
- **Аргууд**:
  - `addTransaction(Transaction transaction)`: Гүйлгээ нэмэх
  - `updateStock(Product product, int quantity)`: Барааны тоог шинэчлэх
  - `generateInventoryReport(Date startDate, Date endDate)`: Тайлан үүсгэх
  - `addClerk(Clerk clerk)`: Нярав нэмэх

### **App (Гол Програм) Класс**
- Системийн эхний анги, агуулахын үйл ажиллагааг удирдах.

## 3. Гол Үйл Ажиллагаанууд

### **Бараа Хүлээн Авах (Орлого Гүйлгээ)**
- `receiveStock()` функц ашиглан бараа нэмэх, орлого бүртгэх.

### **Бараа Гаргах (Зарлага Гүйлгээ)**
- `releaseStock()` функц ашиглан бараа гаргах.
- Хангалттай нөөц байхгүй бол алдаа заана.

### **Нөөцийн Тайлан**
- `generateInventoryReport()` функц ашиглан тодорхой хугацааны тайлан гаргах.

### **Алдааны Хяналт**
- Хангалттай нөөц байхгүй үед алдаа гаргах.

### **Олон Нярав**
- Агуулахад хэд хэдэн нярав ажиллах боломжтой.

## 4. Загварын Шийдлүүд
- **Модульчлах**: Тус тусдаа классууд үүргээ хариуцна.
- **Нууцлал**: Өгөгдөл гадаад орчноос хамгаалагдсан.
- **Гүйлгээний Бүртгэл**: Бүх гүйлгээг хадгална.
- **Өргөжүүлэлтийн боломж**: Менежерүүд нэмэх, илүү нарийвчилсан тайлан гаргах боломжтой.

## 5. Жишээ Ажиллагаа
```java
// Жишээ бараа үүсгэх
Product macbook = new Product(1, "MacBook Pro", 50);
Clerk johnDoe = new Clerk("John Doe", warehouse);
Clerk janeSmith = new Clerk("Jane Smith", warehouse);

// Бараа хүлээн авах
johnDoe.receiveStock(macbook, 30);

// Бараа гаргах
janeSmith.releaseStock(macbook, 10);

// Тайлан үүсгэх
warehouse.generateInventoryReport(startDate, endDate);
```

## 6. Дүгнэлт
Агуулахын Удирдлагын Систем нь барааны нөөцийг хянах, гүйлгээний түүхийг бүртгэх, тайлан үүсгэх үйл ажиллагааг гүйцэтгэдэг. Объект Хандалт Программчлалын зарчмуудыг ашиглан бүтээсэн уг систем нь өргөжүүлэх, хялбар ашиглах, найдвартай ажиллагааг хангах боломжтой.
