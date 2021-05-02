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

object FA_TISSUE_BOX: Icon {
	
	override val name get() = "Tissue Box"
	
	override val unicode get() = "e05b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M383.88,287.82l64-192H338.47a70.2,70.2,0,0,1-66.59-48,70.21,70.21,0,0,0-66.6-48H63.88l64,288Zm-384,192a32,32,0,0,0,32,32h448a32,32,0,0,0,32-32v-64H-.12Zm480-256H438.94l-21.33,64h14.27a16,16,0,0,1,0,32h-352a16,16,0,1,1,0-32H95.09l-14.22-64h-49a32,32,0,0,0-32,32v128h512v-128A32,32,0,0,0,479.88,223.82Z"/></svg>"""
		else -> null
	}
	
}
