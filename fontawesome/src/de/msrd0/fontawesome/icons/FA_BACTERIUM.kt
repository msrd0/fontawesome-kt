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

object FA_BACTERIUM: Icon {
	
	override val name get() = "Bacterium"
	
	override val unicode get() = "e05a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M511,102.93A23.76,23.76,0,0,0,481.47,87l-15.12,4.48a111.85,111.85,0,0,0-48.5-47.42l3.79-14.47a23.74,23.74,0,0,0-46-11.91l-3.76,14.37a111.94,111.94,0,0,0-22.33,1.47,386.74,386.74,0,0,0-44.33,10.41l-4.3-12a23.74,23.74,0,0,0-44.75,15.85l4.3,12.05a383.4,383.4,0,0,0-58.69,31.83l-8-10.63a23.85,23.85,0,0,0-33.24-4.8,23.57,23.57,0,0,0-4.83,33.09l8,10.63a386.14,386.14,0,0,0-46.7,47.44l-11-8a23.68,23.68,0,1,0-28,38.17l11.09,8.06a383.45,383.45,0,0,0-30.92,58.75l-12.93-4.43a23.65,23.65,0,1,0-15.47,44.69l13,4.48a385.81,385.81,0,0,0-9.3,40.53A111.58,111.58,0,0,0,32.44,375L17,379.56a23.64,23.64,0,0,0,13.51,45.31l15-4.44a111.49,111.49,0,0,0,48.53,47.24l-3.85,14.75a23.66,23.66,0,0,0,17,28.83,24.7,24.7,0,0,0,6,.75,23.73,23.73,0,0,0,23-17.7L140,479.67c1.37.05,2.77.35,4.13.35A111.22,111.22,0,0,0,205,461.5l11.45,11.74a23.7,23.7,0,0,0,34.08-32.93l-12.19-12.5a111,111,0,0,0,16.11-41.4,158.69,158.69,0,0,1,5.16-20.71l12,5.64a23.66,23.66,0,1,0,20.19-42.79l-11.72-5.49c.89-1.32,1.59-2.77,2.52-4.06a157.86,157.86,0,0,1,10.46-12.49,159.5,159.5,0,0,1,15.59-15.28,162.18,162.18,0,0,1,13.23-10.4c1.5-1,3.1-1.89,4.63-2.87l5.23,11.8a23.74,23.74,0,0,0,43.48-19.08l-5.36-12.11a158.87,158.87,0,0,1,16.49-4.1,111,111,0,0,0,45-18.54l13.33,12a23.69,23.69,0,1,0,31.88-35l-12.94-11.67A110.83,110.83,0,0,0,479.21,137L495,132.32A23.61,23.61,0,0,0,511,102.93ZM160,368a48,48,0,1,1,48-48A48,48,0,0,1,160,368Zm80-136a24,24,0,1,1,24-24A24,24,0,0,1,240,232Z"/></svg>"""
		else -> null
	}
	
}
