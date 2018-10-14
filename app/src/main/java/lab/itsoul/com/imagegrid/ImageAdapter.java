package lab.itsoul.com.imagegrid;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private List<Image> images;
    private ConstraintLayout layout;

    public ImageAdapter(Context c, List<Image> images) {
        mContext = c;
        this.images = images;
    }

    public int getCount() {
        return images.size();
    }

    public Object getItem(int position) {
        return images.get(position);
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.image_view, null);
            convertView.setTag(viewHolder);
            viewHolder.image = convertView.findViewById(R.id.photo2);
            viewHolder.title = convertView.findViewById(R.id.imageTitle);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Picasso.get()
                .load(images.get(position).getPhoto())
                .resize(120, 80)
                .into(viewHolder.image);
        viewHolder.title.setText(images.get(position).getAuthor());
        return convertView;
    }

    private static class ViewHolder{
        public ImageView image;
        public TextView title;
    }
}



// if it's not recycled, initialize some attributes
//>>>>>>> 170fd7ba5b07c2818591f5dead03132749542ee5
////            imageView = new ImageView(mContext);
////            imageView.setLayoutParams(new ViewGroup.LayoutParams(85, 85));
////            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
////            imageView.setPadding(8, 8, 8, 8);
//<<<<<<< HEAD
//        } else {
////            imageView = (ImageView) convertView;
//            view = convertView;
//        }

//        imageView.setImageURI(Uri.parse(images.get(position).getPhoto()));
//        Picasso.get().load(images.get(position).getPhoto()).into(imageView);
//        ImageView photo = view.findViewById(R.id.photo2);
//        TextView title = view.findViewById(R.id.imageTitle);
//        Picasso.get().load(images.get(position).getPhoto()).into(photo);
//        title.setText(images.get(position).getAuthor());
//        return view;
//    }

//    // references to our images
//    private Integer[] mThumbIds = {
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7,
//            R.drawable.sample_0, R.drawable.sample_1,
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7,
//            R.drawable.sample_0, R.drawable.sample_1,
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7
//    };
//}
//=======

//            imageView = (ImageView) convertView;



//        imageView.setImageURI(Uri.parse(images.get(position).getPhoto()));
//        Picasso.get().load(images.get(position).getPhoto()).into(imageView);
//        return imageView;
//>>>>>>> 170fd7ba5b07c2818591f5dead03132749542ee5
