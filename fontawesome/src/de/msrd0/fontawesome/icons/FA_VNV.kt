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

/** VNV */
object FA_VNV: Icon {
	
	override val name get() = "VNV"
	
	override val unicode get() = "f40b"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M104.9 352c-34.1 0-46.4-30.4-46.4-30.4L2.6 210.1S-7.8 192 13 192h32.8c10.4 0 13.2 8.7 18.8 18.1l36.7 74.5s5.2 13.1 21.1 13.1 21.1-13.1 21.1-13.1l36.7-74.5c5.6-9.5 8.4-18.1 18.8-18.1h32.8c20.8 0 10.4 18.1 10.4 18.1l-55.8 111.5S174.2 352 140 352h-35.1zm395 0c-34.1 0-46.4-30.4-46.4-30.4l-55.9-111.5S387.2 192 408 192h32.8c10.4 0 13.2 8.7 18.8 18.1l36.7 74.5s5.2 13.1 21.1 13.1 21.1-13.1 21.1-13.1l36.8-74.5c5.6-9.5 8.4-18.1 18.8-18.1H627c20.8 0 10.4 18.1 10.4 18.1l-55.9 111.5S569.3 352 535.1 352h-35.2zM337.6 192c34.1 0 46.4 30.4 46.4 30.4l55.9 111.5s10.4 18.1-10.4 18.1h-32.8c-10.4 0-13.2-8.7-18.8-18.1l-36.7-74.5s-5.2-13.1-21.1-13.1c-15.9 0-21.1 13.1-21.1 13.1l-36.7 74.5c-5.6 9.4-8.4 18.1-18.8 18.1h-32.9c-20.8 0-10.4-18.1-10.4-18.1l55.9-111.5s12.2-30.4 46.4-30.4h35.1z"/></svg>"""
		else -> null
	}
	
}
