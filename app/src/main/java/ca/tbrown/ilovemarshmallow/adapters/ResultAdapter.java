package ca.tbrown.ilovemarshmallow.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ca.tbrown.ilovemarshmallow.R;
import ca.tbrown.ilovemarshmallow.pojo.Result;
import ca.tbrown.ilovemarshmallow.viewholders.ResultViewHolder;

/**
 * Created by tmast_000 on 9/9/2015.
 */
public class ResultAdapter extends RecyclerView.Adapter<ResultViewHolder> {

    private List<Result> results;

    public ResultAdapter(List<Result> results) {
        this.results = results;
    }

    @Override
    public ResultViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.viewholder_result, viewGroup, false);

        return new ResultViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ResultViewHolder viewHolder, int i) {
        viewHolder.bind(results.get(i));
    }

    @Override
    public int getItemCount() {
        return results.size();
    }
}
