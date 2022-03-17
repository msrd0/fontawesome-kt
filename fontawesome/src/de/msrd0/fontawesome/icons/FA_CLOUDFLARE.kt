/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.BRANDS

/** Cloudflare */
object FA_CLOUDFLARE: Icon {
	
	override val name get() = "Cloudflare"
	
	override val unicode get() = "e07d"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M407.906,319.913l-230.8-2.928a4.58,4.58,0,0,1-3.632-1.926,4.648,4.648,0,0,1-.494-4.147,6.143,6.143,0,0,1,5.361-4.076L411.281,303.9c27.631-1.26,57.546-23.574,68.022-50.784l13.286-34.542a7.944,7.944,0,0,0,.524-2.936,7.735,7.735,0,0,0-.164-1.631A151.91,151.91,0,0,0,201.257,198.4,68.12,68.12,0,0,0,94.2,269.59C41.924,271.106,0,313.728,0,366.12a96.054,96.054,0,0,0,1.029,13.958,4.508,4.508,0,0,0,4.445,3.871l426.1.051c.043,0,.08-.019.122-.02a5.606,5.606,0,0,0,5.271-4l3.273-11.265c3.9-13.4,2.448-25.8-4.1-34.9C430.124,325.423,420.09,320.487,407.906,319.913ZM513.856,221.1c-2.141,0-4.271.062-6.391.164a3.771,3.771,0,0,0-3.324,2.653l-9.077,31.193c-3.9,13.4-2.449,25.786,4.1,34.89,6.02,8.4,16.054,13.323,28.238,13.9l49.2,2.939a4.491,4.491,0,0,1,3.51,1.894,4.64,4.64,0,0,1,.514,4.169,6.153,6.153,0,0,1-5.351,4.075l-51.125,2.939c-27.754,1.27-57.669,23.574-68.145,50.784l-3.695,9.606a2.716,2.716,0,0,0,2.427,3.68c.046,0,.088.017.136.017h175.91a4.69,4.69,0,0,0,4.539-3.37,124.807,124.807,0,0,0,4.682-34C640,277.3,583.524,221.1,513.856,221.1Z"/></svg>"""
		else -> null
	}
	
}
