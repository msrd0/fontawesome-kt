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

object FA_ALTERNATE_CROP: Icon {
	
	override val name get() = "Alternate Crop"
	
	override val unicode get() = "f565"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M488 352h-40V96c0-17.67-14.33-32-32-32H192v96h160v328c0 13.25 10.75 24 24 24h48c13.25 0 24-10.75 24-24v-40h40c13.25 0 24-10.75 24-24v-48c0-13.26-10.75-24-24-24zM160 24c0-13.26-10.75-24-24-24H88C74.75 0 64 10.74 64 24v40H24C10.75 64 0 74.74 0 88v48c0 13.25 10.75 24 24 24h40v256c0 17.67 14.33 32 32 32h224v-96H160V24z"/></svg>"""
		else -> null
	}
	
}
