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
import {Box} from "@mui/material";


const Transition = React.forwardRef(function Transition(props, ref) {
  return <Slide direction="up" ref={ref} {...props} />;
});


const DialogContainer = ({show, onClose, title}) => {
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
                        <Grid item xs={11.5}>
                            <Typography sx={{fontSize: 20}}>{title ? title : 'Dialog'}</Typography>
                        </Grid>
                        <Grid item xs={0.5}>
                            <CloseIcon onClick={onClose}/>
                        </Grid>
                    </Grid>
                    {/*<Typography sx={{fontSize: 20}}>{title ? title : 'Dialog'}</Typography>*/}
                    {/*<CloseIcon/>*/}

                </DialogTitle>
                <DialogContent>
                    <DialogContentText id="alert-dialog-description">
                        Let Google help apps determine location. This means sending anonymous
                        location data to Google, even when no apps are running.
                    </DialogContentText>
                </DialogContent>
                <DialogActions>
                    <Button onClick={onClose}>Disagree</Button>
                    <Button onClick={onClose} autoFocus>
                        Agree
                    </Button>
                </DialogActions>
            </Dialog>
        </div>
    );
}

export default DialogContainer