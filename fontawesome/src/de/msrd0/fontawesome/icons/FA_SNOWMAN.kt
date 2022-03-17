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

object FA_SNOWMAN: Icon {
	
	override val name get() = "Snowman"
	
	override val unicode get() = "f7d0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M510.9 152.3l-5.875-14.5c-3.25-8-12.62-11.88-20.75-8.625l-28.25 11.5v-29C455.1 103 448.7 96 439.1 96h-16c-8.75 0-16 7-16 15.62V158.5c0 .5 .25 1 .25 1.5l-48.98 20.6c-5.291-12.57-12.98-23.81-22.24-33.55c9.35-14.81 14.98-32.23 14.98-51.04C351.1 42.98 309 0 255.1 0S160 42.98 160 95.1c0 18.81 5.626 36.23 14.98 51.04C165.7 156.8 158.1 168.1 152.8 180.7L103.8 160c0-.5 .25-1 .25-1.5V111.6C104 103 96.76 96 88.01 96h-16c-8.75 0-16 7-16 15.62v29l-28.25-11.5c-8.125-3.25-17.5 .625-20.75 8.625l-5.875 14.5C-2.119 160.4 1.881 169.5 10.01 172.6L144.4 228.4C144.9 240.8 147.3 252.7 151.5 263.7c-33.78 29.34-55.53 72.04-55.53 120.3c0 52.59 25.71 98.84 64.88 128h190.2c39.17-29.17 64.88-75.42 64.88-128c0-48.25-21.76-90.95-55.53-120.3c4.195-11.03 6.599-22.89 7.091-35.27l134.4-55.8C510.1 169.5 514.1 160.4 510.9 152.3zM224 95.1c-8.75 0-15.1-7.25-15.1-15.1s7.25-15.1 15.1-15.1s15.1 7.25 15.1 15.1S232.8 95.1 224 95.1zM256 367.1c-8.75 0-15.1-7.25-15.1-15.1S247.3 335.1 256 335.1s15.1 7.25 15.1 15.1S264.8 367.1 256 367.1zM256 303.1c-8.75 0-15.1-7.25-15.1-15.1S247.3 271.1 256 271.1s15.1 7.25 15.1 15.1S264.8 303.1 256 303.1zM256 239.1c-8.75 0-15.1-7.25-15.1-15.1S247.3 207.1 256 207.1s15.1 7.25 15.1 15.1S264.8 239.1 256 239.1zM256 152c0 0-15.1-23.25-15.1-32S247.3 104 256 104s15.1 7.25 15.1 16S256 152 256 152zM287.1 95.1c-8.75 0-15.1-7.25-15.1-15.1s7.25-15.1 15.1-15.1s15.1 7.25 15.1 15.1S296.7 95.1 287.1 95.1z"/></svg>"""
		else -> null
	}
	
}
