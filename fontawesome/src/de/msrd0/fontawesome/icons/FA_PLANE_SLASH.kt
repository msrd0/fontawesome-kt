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
import de.msrd0.fontawesome.Style.SOLID

object FA_PLANE_SLASH: Icon {
	
	override val name get() = "Plane Slash"
	
	override val unicode get() = "e069"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M32.48,147.88,64,256,32.48,364.13A16,16,0,0,0,48,384H88a16,16,0,0,0,12.8-6.41L144,320H246.85l-49,171.59A16,16,0,0,0,213.2,512h65.5a16,16,0,0,0,13.89-8.06l66.6-116.54L34.35,136.34A15.47,15.47,0,0,0,32.48,147.88ZM633.82,458.09,455.14,320H512c35.34,0,96-28.66,96-64s-60.66-64-96-64H397.7L292.61,8.06C290.06,3.61,283.84,0,278.71,0H213.2a16,16,0,0,0-15.38,20.39l36.94,129.29L45.46,3.38A16,16,0,0,0,23,6.19L3.37,31.45A16,16,0,0,0,6.18,53.91L594.54,508.63A16,16,0,0,0,617,505.81l19.64-25.26A16,16,0,0,0,633.82,458.09Z"/></svg>"""
		else -> null
	}
	
}
