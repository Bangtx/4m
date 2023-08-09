import {Typography, Box, TextField, Button, Grid, Hidden, Stack} from "@mui/material";
import AddIcon from '@mui/icons-material/Add';

const SearchAndAdd = () => {
    return (
        <Box width="100%" p={2}>
            <Grid container maxWidth={1200} margin="0 auto" >
                <Grid item xs={12}>
                    <Typography variant={'h4'} sx={{textAlign: 'center', color: '#309D26'}}>
                        Company Management
                    </Typography>
                </Grid>
                <Grid item xs={10}>
                    <TextField id="outlined-basic" label="Search" fullWidth/>
                </Grid>
                <Grid item xs={2} sx={{pl: 1}}>
                    <Button variant='contained' fullWidth sx={{height: 55}} style={{backgroundColor: '#309D26'}}>
                        <AddIcon/>
                        <Hidden smDown>
                            <span>Add New</span>
                        </Hidden>
                    </Button>
                </Grid>
            </Grid>
        </Box>
    )
}

export default SearchAndAdd