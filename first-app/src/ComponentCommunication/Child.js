import React from 'react';
class Child extends React.Component{
    constructor(props)
    {
        super(props);
        this.state={
            data:this.props.datafromparent
        }
    }
    render()
    {
        const {data}=this.state
        return(
            <div>
          <h3>{data}</h3>
          </div>
        )
    }
}
export default Child;