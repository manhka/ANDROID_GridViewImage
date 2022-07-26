package manhnguyen.gridview.gridviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class ImageAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Image> imageList;

    public ImageAdapter(Context context, int layout, List<Image> imageList) {
        this.context = context;
        this.layout = layout;
        this.imageList = imageList;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
private class ViewHolder {
        ImageView imageView;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
if (view==null){
holder=new ViewHolder();
    LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
view=layoutInflater.inflate(layout,null);
holder.imageView=view.findViewById(R.id.imageView);
view.setTag(holder);

}else {
    holder= (ViewHolder) view.getTag();
}
Image image=imageList.get(i);
holder.imageView.setImageResource(image.getImage());
        return view;
    }
}
