'use client'

import * as React from 'react';
import Image from 'next/image'
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import Drawer from './4mDrawer'


export default function HeaderBar() {
    const [showDrawer, setShowDrawer] = React.useState(false)

    return (
        <Box>
            <AppBar position="static" sx={{backgroundColor: '#309D26'}}>
                <Toolbar>
                    <IconButton
                        size="large"
                        edge="start"
                        color="inherit"
                        aria-label="menu"
                        sx={{mr: 2}}
                        onClick={() => setShowDrawer(!showDrawer)}
                    >
                        <MenuIcon/>
                    </IconButton>
                    <Typography variant="h6" component="div" sx={{flexGrow: 1, textAlign: 'center'}}>
                        Workshop Management
                    </Typography>
                    <Image
                        src="/logo4m.png"
                        width={80}
                        height={64}
                        priority
                        alt="Logo"/>
                </Toolbar>
            </AppBar>

            <Drawer
                show={showDrawer}
                onClose={() => setShowDrawer(!showDrawer)}
            >
                test
            </Drawer>
        </Box>
    );
}