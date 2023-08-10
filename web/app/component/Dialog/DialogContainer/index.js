import * as React from 'react';
import Button from '@mui/material/Button';
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';
import Slide from '@mui/material/Slide';
import Typography from '@mui/material/Typography'
import Toolbar from '@mui/material/Toolbar'
import Grid from '@mui/material/Grid'
import CloseIcon from '@mui/icons-material/Close';
import {Box, IconButton} from "@mui/material";


const Transition = React.forwardRef(function Transition(props, ref) {
  return <Slide direction="up" ref={ref} {...props} />;
});


const DialogContainer = ({show, onClose, title, children, onSave}) => {
    return (
        <div>
            <Dialog
                open={show}
                onClose={onClose}
                keepMounted
                TransitionComponent={Transition}
                aria-labelledby="alert-dialog-title"
                aria-describedby="alert-dialog-description"
            >
                <DialogTitle id="alert-dialog-title" sx={{backgroundColor: '#309D26', color: 'white'}}>
                    <Grid container>
                        <Grid item xs={10.5}>
                            <Typography sx={{fontSize: 20}}>{title ? title : 'Dialog'}</Typography>
                        </Grid>
                        <Grid item xs={1.5}>
                            <IconButton sx={{color: 'white'}} onClick={onClose}>
                                <CloseIcon/>
                            </IconButton>
                        </Grid>
                    </Grid>

                </DialogTitle>
                <DialogContent style={{minWidth: 350}}>
                    {children ? children : null}
                </DialogContent>
                <DialogActions>
                    <Button onClick={onSave} fullWidth variant={"contained"} style={{backgroundColor: '#309D26'}}>
                        Save
                    </Button>
                </DialogActions>
            </Dialog>
        </div>
    );
}

export default DialogContainer