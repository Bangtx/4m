import * as React from "react";
import {Drawer} from '@mui/material';

const BDrawer = ({show, onClose}) => {
    return (
        <Drawer
            open={show}
            onClose={onClose}
        >
            test
        </Drawer>
    )
}

export default BDrawer