import React from 'react';
import Child from './Child';
class Parent extends React.Component{
    constructor(props)
    {
        super(props);
        this.state={
            data:"Message From parent"
        }
    }
    render()
    {
        const {data}=this.state
        return(
            <div>
          <Child datafromparent={data}></Child>
          </div>
        )
    }
}
export default Parent;