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

object FA_RAISED_FIST: Icon {
	
	override val name get() = "Raised Fist"
	
	override val unicode get() = "f6de"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M224 180.4V32c0-17.67-14.31-32-32-32S160 14.33 160 32v144h40C208.5 176 216.5 177.7 224 180.4zM128 176V64c0-17.67-14.31-32-32-32S64 46.33 64 64v112.8C66.66 176.5 69.26 176 72 176H128zM288 192c17.69 0 32-14.33 32-32V64c0-17.67-14.31-32-32-32s-32 14.33-32 32v96C256 177.7 270.3 192 288 192zM384 96c-17.69 0-32 14.33-32 32v64c0 17.67 14.31 32 32 32s32-14.34 32-32.02V128C416 110.3 401.7 96 384 96zM350.9 246.2c-12.43-7.648-21.94-19.31-26.88-33.25C313.7 219.9 301.3 223.9 288 223.9c-7.641 0-14.87-1.502-21.66-3.957C269.1 228.6 272 238.1 272 248c0 39.77-32.25 72-72 72H128c-8.836 0-16-7.164-16-16C112 295.2 119.2 288 128 288h72c22.09 0 40-17.91 40-40S222.1 208 200 208h-128C49.91 208 32 225.9 32 248v63.41c0 33.13 16 64.56 42.81 84.13L128 434.2V512h224v-85.09c38.3-24.09 64-66.42 64-114.9V247.1C406.6 252.6 395.7 256 384 256C371.7 256 360.5 252.2 350.9 246.2z"/></svg>"""
		else -> null
	}
	
}

val FA_FIST_RAISED = FA_RAISED_FIST
