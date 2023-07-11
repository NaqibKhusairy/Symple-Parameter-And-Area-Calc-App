package com.naqib.sympleparameterandareacalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PACAOP extends AppCompatActivity {
    ImageView shapeimage,bm,bi;
    TextView shapename,penerangan;
    Button para,area,back;
    String shape,calculation,explain;
    int ShapeImage;

    public void explainbi(){
        switch (shape){
            case "CIRCLE":
                explain="A circle is a perfectly round shape in two dimensions, formed by points " +
                        "equidistant from a fixed center point. To find the circumference of a " +
                        "circle, you can multiply the diameter by π (pi), or double the radius and " +
                        "multiply by π. The area of a circle can be calculated by multiplying the " +
                        "square of the radius by π. The value of π is approximately 3.142, and it " +
                        "is a mathematical constant commonly used in circle calculations.";
                break;
            case "ELLIPSE":
                explain="An ellipse is a flattened circular shape with two focal points. To calculate " +
                        "the area of an ellipse, you can use the formula A = πab, where a represents " +
                        "the semi-major axis (half the length of the longest diameter) and b represents " +
                        "the semi-minor axis (half the length of the shortest diameter). By multiplying " +
                        "the values of a and b and then multiplying the result by π (pi), you can obtain " +
                        "the area of the ellipse.";
                break;
            case "TRIANGLE":
                explain="A triangle is a polygon with three sides and three angles. To find the area of a " +
                        "triangle, you can use the formula A = 1/2 × base × height, where the base represents " +
                        "the length of any side of the triangle and the height represents the perpendicular " +
                        "distance from the base to the opposite vertex. The perimeter of a triangle is calculated " +
                        "by adding the lengths of all three sides together. By adding the lengths of the three sides, " +
                        "you can determine the perimeter, which represents the total distance around the triangle.";
                break;
            case "SQUARE":
                explain="A square is a four-sided polygon with equal sides and right angles. To find the area of a " +
                        "square, you can square the length of one side, represented by a, using the formula A = a^2. " +
                        "The perimeter of a square is calculated by multiplying the length of one side by 4, since all " +
                        "sides are equal, resulting in P = 4a. By squaring the length of the side for the area and " +
                        "multiplying it by 4 for the perimeter, you can determine this measurement for a square.";
                break;
            case "RECTANGLE":
                explain="A rectangle is a four-sided polygon with opposite sides that are parallel and equal in length, " +
                        "forming right angles. To find the area of a rectangle, you can multiply the length (l) by " +
                        "the width (w), which gives you the total amount of space enclosed within the rectangle. " +
                        "The perimeter of a rectangle is obtained by adding the lengths of all its sides, which is " +
                        "equal to twice the sum of its length and width. By calculating the product of length and width for the " +
                        "area, and adding the lengths of all sides for the perimeter, you can determine these measurements " +
                        "for a rectangle.";
                break;
            case "RHOMBUS":
                explain="A rhombus is a four-sided geometric shape with opposite sides that are parallel and equal in length. " +
                        "To find the area of a rhombus, you can use the formula A = (h * w) / 2, where h and w represent the lengths " +
                        "of the diagonals that intersect at the center of the rhombus. By multiplying the two diagonals and dividing the " +
                        "result by 2, you can calculate the area. For the perimeter of a rhombus, you can use the formula P = 4a, where s " +
                        "represents the length of any side of the rhombus. By multiplying the length of a side by 4, you can obtain the perimeter.";
                break;
            case "KITE":
                explain="A kite is a four-sided geometric shape that has two pairs of adjacent sides of equal length. To find the " +
                        "area of a kite, you can use the formula A = (a * b) / 2, where d₁ and d₂ represent the lengths of the two " +
                        "diagonals that intersect at a right angle. By multiplying the lengths of the diagonals and dividing the " +
                        "result by 2, you can obtain the area of the kite. To find the perimeter of a kite, you add the lengths of " +
                        "all four sides. The formula for the perimeter of a kite is P = 4a, where a represent the lengths of the four sides. " +
                        "By adding these side lengths together, you can determine the perimeter of the kite.";
                break;
            case "PARALLELOGRAM":
                explain="A parallelogram is a four-sided polygon with opposite sides that are parallel and equal in length. To find " +
                        "the area of a parallelogram, you multiply the length of the base (one of the parallel sides) by the perpendicular " +
                        "height (the distance between the base and its opposite side). The formula for the area is A = base × height. To " +
                        "calculate the perimeter of a parallelogram, you add up the lengths of all its sides. In a parallelogram, opposite " +
                        "sides are equal in length, so you can find the perimeter by adding the lengths of two adjacent sides and then " +
                        "multiplying by 2. The formula for the perimeter is P = 2 × (a + b). Understanding these formulas allows you to determine" +
                        " the area and perimeter of a parallelogram, given the appropriate measurements of its sides and height.";
                break;
            case "TRAPEZOID":
                explain="A trapezoid is a quadrilateral shape with one pair of parallel sides. To calculate the area of a trapezoid, you can use " +
                        "the formula A = 1/2(a + b)h, where a and b represent the lengths of the parallel sides, and h represents the height or the " +
                        "perpendicular distance between the parallel sides. By adding the lengths of the parallel sides, dividing the sum by 2, and " +
                        "then multiplying it by the height, you can determine the area of the trapezoid. To find the perimeter of a trapezoid, you add " +
                        "the lengths of all its four sides.";
                break;
            case "PENTAGON":
                explain="A pentagon is a polygon with five sides and five angles. To find the perimeter of a pentagon, you need to add together the " +
                        "lengths of all its sides. Each side may have a different length, so it is necessary to measure or know the lengths of all the " +
                        "sides. By summing up these lengths, you can calculate the perimeter of the pentagon, which represents the total distance around " +
                        "its boundary.";
                break;
            case "HEXAGON":
                explain="A hexagon is a polygon with six sides and six angles. To find the perimeter of a hexagon, you can add the lengths of all " +
                        "six sides together. If all sides of the hexagon are equal, which is known as a regular hexagon, you can multiply the length " +
                        "of one side by six to obtain the perimeter. However, if the sides are not equal, you need to measure each side individually " +
                        "and then sum them up to calculate the total perimeter. By understanding the concept of adding the lengths of all sides, you " +
                        "can determine the perimeter of a hexagon accurately.";
                break;
            case "HEPTAGON":
                explain="A heptagon is a polygon with seven sides and seven angles. To calculate the perimeter of a heptagon, you need to know the length " +
                        "of each of its sides. By adding the lengths of all seven sides together, you can determine the total perimeter of the heptagon. " +
                        "Remember to ensure that the measurements used for each side are consistent, as the sum of the side lengths will give you the " +
                        "perimeter, which represents the total length of the boundary of the heptagon.";
                break;
            case "OCTAGON":
                explain="An octagon is a polygon with eight sides. To find the perimeter of an octagon, you need to know the length of one side. " +
                        "Since all sides of a regular octagon are equal in length, you can multiply the length of one side by eight to get the total " +
                        "perimeter. In other words, the perimeter of an octagon is calculated by multiplying the length of one side by 8. This simple " +
                        "formula allows you to determine the total length of all sides combined in an octagon.";
                break;
            case "NONAGON":
                explain="A nonagon is a polygon with nine sides and nine angles. To find the perimeter of a nonagon, you need to know the length of " +
                        "each side. Simply add up the lengths of all nine sides to obtain the perimeter. Each side of a regular nonagon " +
                        "(where all sides and angles are equal) will have the same length, making the calculation straightforward. However, if the " +
                        "nonagon is irregular, with sides of varying lengths, you will need to measure or know the lengths of each side and sum them " +
                        "up to determine the perimeter.";
                break;
            case "DECAGON":
                explain="A decagon is a polygon with ten sides and ten angles. To find the perimeter of a decagon, you can add up the lengths of all " +
                        "its sides. Since a regular decagon has equal side lengths, you can multiply the length of one side (a) by 10 to get the total " +
                        "perimeter. Therefore, the perimeter of a regular decagon can be calculated as P = 10a, where P represents the perimeter and a " +
                        "represents the length of one side.";
                break;
            default:
        }
        penerangan.setText(explain);
        bi.setVisibility(View.VISIBLE);
        bm.setVisibility(View.GONE);
    }
    public void explainbm(){
        switch (shape){
            case "CIRCLE":
                explain="Bulatan ialah bentuk bulat sempurna dalam dua dimensi, dibentuk oleh titik " +
                        "yang sama jarak dari titik pusat tetap. Untuk mencari lilitan bulatan, anda " +
                        "boleh mendarab diameter dengan π (pi), atau menggandakan jejari dan mendarab " +
                        "dengan π. Luas bulatan boleh dikira dengan mendarab kuasa dua jejari dengan π. " +
                        "Nilai π ialah lebih kurang 3.142, dan ia adalah pemalar matematik yang biasa " +
                        "digunakan dalam pengiraan bulatan.";
                break;
            case "ELLIPSE":
                explain="Elips ialah bentuk bulat yang diratakan dengan dua titik fokus. Untuk mengira " +
                        "luas elips, anda boleh menggunakan formula A = πab, di mana a mewakili paksi " +
                        "separuh utama (separuh panjang diameter terpanjang) dan b mewakili paksi separuh " +
                        "kecil (separuh panjang diameter terpendek ). Dengan mendarab nilai a dan b dan " +
                        "kemudian mendarabkan hasilnya dengan π (pi), anda boleh memperoleh luas elips.";
                break;
            case "TRIANGLE":
                explain="Segitiga ialah poligon dengan tiga sisi dan tiga sudut. Untuk mencari luas segi tiga, " +
                        "anda boleh menggunakan formula A = 1/2 × tapak × tinggi, di mana tapak mewakili panjang " +
                        "mana-mana sisi segitiga dan ketinggian mewakili jarak serenjang dari tapak ke bucu " +
                        "bertentangan. Perimeter segi tiga dikira dengan menambah panjang ketiga-tiga sisi " +
                        "bersama-sama. Dengan menambah panjang tiga sisi, anda boleh menentukan perimeter, " +
                        "yang mewakili jumlah jarak sekitar segi tiga.";
                break;
            case "SQUARE":
                explain="Segi empat sama ialah poligon empat sisi dengan sisi yang sama dan sudut tegak. " +
                        "Untuk mencari luas segi empat sama, anda boleh kuasa dua panjang satu sisi, " +
                        "diwakili oleh a menggunakan formula A = a^2. Perimeter segi empat sama dikira dengan " +
                        "mendarab panjang satu sisi dengan 4, kerana semua sisi adalah sama, menghasilkan P = 4a. " +
                        "Dengan mengkuadratkan panjang sisi untuk kawasan dan mendarabnya dengan 4 untuk perimeter, " +
                        "anda boleh menentukan ukuran ini untuk segi empat sama.";
                break;
            case "RECTANGLE":
                explain="Segi empat tepat ialah poligon empat sisi dengan sisi bertentangan yang selari dan sama panjang, " +
                        "membentuk sudut tegak. Untuk mencari luas segi empat tepat, anda boleh mendarab panjang (l) " +
                        "dengan lebar (w), yang memberikan anda jumlah ruang yang disertakan dalam segi empat tepat. " +
                        "Perimeter segi empat tepat diperoleh dengan menambah panjang semua sisinya, yang sama dengan " +
                        "dua kali jumlah panjang dan lebarnya. Dengan mengira hasil darab panjang dan lebar untuk kawasan " +
                        "itu, dan menambah panjang semua sisi untuk perimeter, anda boleh menentukan ukuran ini untuk " +
                        "segi empat tepat.";
                break;
            case "RHOMBUS":
                explain="Rombus ialah bentuk geometri empat segi dengan sisi bertentangan yang selari dan sama panjang. " +
                        "Untuk mencari luas rombus, anda boleh menggunakan formula A = (h * w) / 2, di mana h dan w mewakili " +
                        "panjang pepenjuru yang bersilang di tengah rombus. Dengan mendarab dua pepenjuru dan membahagikan hasilnya " +
                        "dengan 2, anda boleh mengira luas. Untuk perimeter rombus, anda boleh menggunakan formula P = 4a, dengan s mewakili " +
                        "panjang mana-mana sisi rombus. Dengan mendarab panjang sisi dengan 4, anda boleh mendapatkan perimeter.";
                break;
            case "KITE":
                explain="Layang-layang ialah bentuk geometri empat segi yang mempunyai dua pasang sisi bersebelahan yang sama panjang. " +
                        "Untuk mencari luas wau, anda boleh menggunakan formula A = (a * b) / 2, dengan a dan b mewakili panjang dua pepenjuru " +
                        "yang bersilang pada sudut tepat. Dengan mendarab panjang pepenjuru dan membahagikan hasilnya dengan 2, anda boleh mendapatkan " +
                        "luas layang-layang. Untuk mencari perimeter wau, anda menambah panjang keempat-empat sisi. Formula bagi perimeter wau ialah " +
                        "P = 4a, di mana a mewakili panjang empat sisi. Dengan menambah panjang sisi ini bersama-sama, anda boleh menentukan perimeter wau.";
                break;
            case "PARALLELOGRAM":
                explain="Segi empat selari ialah poligon empat segi dengan sisi bertentangan yang selari dan sama panjang. Untuk mencari luas segi empat " +
                        "selari, anda mendarabkan panjang tapak (salah satu sisi selari) dengan ketinggian serenjang (jarak antara tapak dan sisi " +
                        "bertentangannya). Rumus untuk kawasan itu ialah A = tapak × tinggi. Untuk mengira perimeter segi empat selari, anda menambah " +
                        "panjang semua sisinya. Dalam segi empat selari, sisi bertentangan adalah sama panjang, jadi anda boleh mencari perimeter dengan " +
                        "menambah panjang dua sisi bersebelahan dan kemudian mendarab dengan 2. Formula untuk perimeter ialah P = 2 × (a + b). Memahami " +
                        "formula ini membolehkan anda menentukan luas dan perimeter segi empat selari, memandangkan ukuran sisi dan ketinggiannya yang sesuai.";
                break;
            case "TRAPEZOID":
                explain="Trapezoid ialah bentuk segiempat dengan sepasang sisi selari. Untuk mengira luas trapezoid, anda boleh menggunakan formula A = " +
                        "1/2(a + b)h, di mana a dan b mewakili panjang sisi selari, dan h mewakili ketinggian atau jarak serenjang antara sisi selari. . " +
                        "Dengan menambah panjang sisi selari, membahagikan hasil tambah dengan 2, dan kemudian mendarabkannya dengan ketinggian, anda " +
                        "boleh menentukan luas trapezoid. Untuk mencari perimeter trapezium, anda menambah panjang keempat-empat sisinya.";
                break;
            case "PENTAGON":
                explain="Pentagon ialah poligon dengan lima sisi dan lima sudut. Untuk mencari perimeter pentagon, anda perlu menambah panjang " +
                        "semua sisinya. Setiap sisi mungkin mempunyai panjang yang berbeza, jadi perlu mengukur atau mengetahui panjang semua sisi. " +
                        "Dengan merumuskan panjang ini, anda boleh mengira perimeter pentagon, yang mewakili jumlah jarak di sekeliling sempadannya.";
                break;
            case "HEXAGON":
                explain="Heksagon ialah poligon dengan enam sisi dan enam sudut. Untuk mencari perimeter heksagon, anda boleh menambah panjang semua " +
                        "enam sisi bersama-sama. Jika semua sisi heksagon adalah sama, yang dikenali sebagai heksagon sekata, anda boleh mendarab " +
                        "panjang satu sisi dengan enam untuk mendapatkan perimeter. Walau bagaimanapun, jika sisi tidak sama, anda perlu mengukur setiap " +
                        "sisi secara individu dan kemudian menjumlahkannya untuk mengira jumlah perimeter. Dengan memahami konsep menambah panjang " +
                        "semua sisi, anda boleh menentukan perimeter heksagon dengan tepat.";
                break;
            case "HEPTAGON":
                explain="Heptagon ialah poligon dengan tujuh sisi dan tujuh sudut. Untuk mengira perimeter heptagon, anda perlu mengetahui panjang " +
                        "setiap sisinya. Dengan menambah panjang semua tujuh sisi bersama-sama, anda boleh menentukan jumlah perimeter heptagon. Ingat " +
                        "untuk memastikan bahawa ukuran yang digunakan untuk setiap sisi adalah konsisten, kerana jumlah panjang sisi akan memberi " +
                        "anda perimeter, yang mewakili jumlah panjang sempadan heptagon.";
                break;
            case "OCTAGON":
                explain="Oktagon ialah poligon dengan lapan sisi. Untuk mencari perimeter oktagon, anda perlu mengetahui panjang satu sisi. Oleh " +
                        "kerana semua sisi oktagon sekata adalah sama panjang, anda boleh mendarab panjang satu sisi dengan lapan untuk mendapatkan " +
                        "jumlah perimeter. Dalam erti kata lain, perimeter oktagon dikira dengan mendarab panjang satu sisi dengan 8. Formula mudah " +
                        "ini membolehkan anda menentukan jumlah panjang semua sisi yang digabungkan dalam oktagon.";
                break;
            case "NONAGON":
                explain="Nonagon ialah poligon dengan sembilan sisi dan sembilan sudut. Untuk mencari perimeter nonagon, anda perlu mengetahui " +
                        "panjang setiap sisi. Hanya tambahkan panjang kesemua sembilan sisi untuk mendapatkan perimeter. Setiap sisi nonagon biasa " +
                        "(di mana semua sisi dan sudut adalah sama) akan mempunyai panjang yang sama, menjadikan pengiraan mudah. Walau bagaimanapun, " +
                        "jika nonagon adalah tidak sekata, dengan sisi yang berbeza-beza panjang, anda perlu mengukur atau mengetahui panjang setiap " +
                        "sisi dan menjumlahkannya untuk menentukan perimeter.";
                break;
            case "DECAGON":
                explain="Dekagon ialah poligon dengan sepuluh sisi dan sepuluh sudut. Untuk mencari perimeter dekagon, anda boleh menjumlahkan panjang " +
                        "semua sisinya. Oleh kerana dekagon sekata mempunyai panjang sisi yang sama, anda boleh mendarab panjang satu sisi (a) dengan " +
                        "10 untuk mendapatkan jumlah perimeter. Oleh itu, perimeter dekagon sekata boleh dikira sebagai P = 10a, di mana P mewakili " +
                        "perimeter dan a mewakili panjang satu sisi.";
                break;
            default:
        }
        penerangan.setText(explain);
        bm.setVisibility(View.VISIBLE);
        bi.setVisibility(View.GONE);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacaop);
        shapeimage=findViewById(R.id.shapeimg);
        shapename=findViewById(R.id.shapename);
        penerangan=findViewById(R.id.penerangan);
        para=findViewById(R.id.parameter);
        area=findViewById(R.id.area);
        back=findViewById(R.id.back);
        bm=findViewById(R.id.ivbm);
        bi=findViewById(R.id.ivbi);

        shape=getIntent().getStringExtra("shape");
        ShapeImage=getIntent().getIntExtra("image", 0);

        shapename.setText(shape);
        shapeimage.setImageResource(ShapeImage);
        bi.setVisibility(View.VISIBLE);
        bm.setVisibility(View.GONE);
        explainbi();

        switch (shape){
            case "ELLIPSE":
                para.setVisibility(View.GONE);
                break;
            case "PENTAGON":
            case "HEXAGON":
            case "HEPTAGON":
            case "OCTAGON":
            case "NONAGON":
            case "DECAGON":
                area.setVisibility(View.GONE);
                break;
            case "CIRCLE":
                para.setText("CIRCUMFERENCE / UKURLILIT");
        }
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explainbm();
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explainbi();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Please Choose Your Shape", Toast.LENGTH_SHORT).show();
                Intent b = new Intent(getApplicationContext(),ChooseShape.class);
                startActivity(b);
            }
        });

        para.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation=para.getText().toString();
                Intent p = new Intent(getApplicationContext(),Calc.class);
                p.putExtra("calculation",calculation);
                p.putExtra("shape",shape);
                startActivity(p);
            }
        });

        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation=area.getText().toString();
                Intent a = new Intent(getApplicationContext(),Calc.class);
                a.putExtra("calculation",calculation);
                a.putExtra("shape",shape);
                startActivity(a);
            }
        });
    }
}