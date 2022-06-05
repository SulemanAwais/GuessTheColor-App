import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    String ColorList[];
    int ColorImages[];
    LayoutInflater inflater;
    public CustomBaseAdapter(Context ctx, String[] ColorList, int[] ColorImages)
    {
        this.context=ctx;
        this.ColorList=ColorList;
        this.ColorImages=ColorImages;
        inflater=LayoutInflater.from(ctx);

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int Position, View convertView, ViewGroup viewGroup) {
        convertView=inflater.inflate(R.layout.activity_custom_list_view,null);
        TextView txtView=convertView.findViewById(R.id.C_textView);
        ImageView imgView=convertView.findViewById(R.id.ImageIcon);
        txtView.setText(ColorList[Position]);
        imgView.setImageResource(ColorImages[Position]);
        return convertView;
    }
}
