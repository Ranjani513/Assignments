import React from 'react';
import Muidatatables from 'mui-datatables';
import { Details } from '@material-ui/icons';
function Tables()
{
    
        const columns=["name","emailId"];
        const data=[
            ["Ranjani","ranjani@gmail.com"],
            ["mamatha","mamatha@gmail.com"]
        ];
        const options={
            filterType:'checkbox',
        };
        return(
            <div className="container" Style="Background-color:rgb(200,0,0,0.4);">
            <Muidatatables
            title={"Details"}
            data={data}
            columns={columns}
            options={options}

            />
            </div>
        )
    


}
export default Tables;
