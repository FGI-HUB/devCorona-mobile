package com.fgihub.stopcoronacmr.ui.home

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fgihub.stopcoronacmr.MapsActivity
import com.fgihub.stopcoronacmr.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.CircleOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions

class HomeFragment : Fragment(), OnMapReadyCallback {


    private lateinit var mMap: MapView
    private val TAG = MapsActivity::class.java.simpleName


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        mMap?.onSaveInstanceState(outState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.fragment_home, container, false)

        mMap = view?.findViewById(R.id.map_home) as MapView
        mMap?.onCreate(savedInstanceState)
        mMap?.getMapAsync(this)

        return view
    }

    override fun onResume() {
        super.onResume()
        mMap?.onResume()
    }

    override fun onPause() {
        super.onPause()
        mMap?.onPause()
    }

    override fun onStart() {
        super.onStart()
        mMap?.onStart()
    }

    override fun onStop() {
        super.onStop()
        mMap?.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        mMap?.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mMap?.onLowMemory()
    }
    
    override fun onMapReady(googleMap: GoogleMap) {
        val map = googleMap

        val latitude = 3.803538
        val longitude = 11.526404
        val homeLatLng = LatLng(latitude, longitude)
        val zoomLevel = 15f

        map.addCircle(CircleOptions().center(homeLatLng).radius(800.0).strokeColor(R.color.colorFillCircle).fillColor(R.color.colorStrokeCircle))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(homeLatLng, zoomLevel))

        setMapStyle(map)
    }

    private fun setMapStyle(map: GoogleMap) {
        try {
            // Customize the styling of the base map using a JSON object defined
            // in a raw resource file.
            val success = map.setMapStyle(
                MapStyleOptions.loadRawResourceStyle(context,
                    R.raw.map_style
                )
            )
            if (!success) {
                Log.e(TAG, "Style parsing failed.")
            }
        } catch (e: Resources.NotFoundException) {
            Log.e(TAG, "Can't find style. Error: ", e)
        }
    }

}
