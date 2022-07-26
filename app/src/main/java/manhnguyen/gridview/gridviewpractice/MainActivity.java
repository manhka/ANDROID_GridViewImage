package manhnguyen.gridview.gridviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Image> imageArrayList;
    ImageAdapter imageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        imageAdapter = new ImageAdapter(this, R.layout.row_layout, imageArrayList);
        gridView.setAdapter(imageAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, imageArrayList.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Anhxa() {
        gridView = (GridView) findViewById(R.id.gridView);
        imageArrayList=new ArrayList<>();
imageArrayList.add(new Image("Minions1",R.drawable.minions1));
imageArrayList.add(new Image("Minions2",R.drawable.minions2));
imageArrayList.add(new Image("Minions3",R.drawable.minions3));
imageArrayList.add(new Image("Minions4",R.drawable.minions4));
imageArrayList.add(new Image("Minions5",R.drawable.minions5));
imageArrayList.add(new Image("Minions6",R.drawable.minions6));
imageArrayList.add(new Image("Minions7",R.drawable.minions7));
imageArrayList.add(new Image("Minions8",R.drawable.minions8));
imageArrayList.add(new Image("Minions9",R.drawable.minions9));

    }
}